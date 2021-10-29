package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковского приложения
 * для работы с данными пользователя и его счетов.
 * @author PAVEL
 * @version 1.0
 */
public class BankService {
    /**
     * Коллекция типа Map хранит всех клиентов банка и их счета.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод проверяет наличие в коллекции клиента с аналогичными паспортными данными,
     * в случае их отсутствия, добавляет клиента в коллекцию.
     * @param user человек, который добавляется в клиенты банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод создает счет на имя клиента. Если такого клиента нет,
     * или счет с аналогичными реквизитами был уже открыт ранее,
     * то счет не будет добавлен.
     * @param passport паспортные данные клиента.
     * @param account счет, который необходимо добавить.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск клиента по паспортным данным.
     * Если пользователь не найден, возвращается null.
     * @param passport паспортные данные клиента.
     * @return возвращает клиента из коллекции или null, если клиента нет.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> passport.equals(u.getPassport()))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск счета по паспортным данным и реквизитам счета.
     * Если клиент найден, то сверяет перечень всех счетов найденного клиента
     * с заданными реквизитами.
     * @param passport паспортные данные клиента.
     * @param requisite реквизиты счета.
     * @return возвращает счет клиента или null, если счета такого нет.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(a -> requisite.equals(a.getRequisite()))
                    .findFirst();

        }
        return rsl;
    }

    /**
     * Метод перечисляет деньги со счета одного клиента, на счет другого клиента.
     * В случае, если счет отправителя или получателя - отсутствует,
     * или у отправителя недостаточно денег, то перевод не будет произведен.
     * @param srcPassport паспортные данные отправителя.
     * @param srcRequisite реквизиты счета отправителя.
     * @param destPassport паспортные данные получателя.
     * @param destRequisite реквизиты счета получателя.
     * @param amount количество средств для отправки.
     * @return возвращает true или false в зависимости от успеха операции.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> sourceAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (sourceAccount.isPresent()
                && destAccount.isPresent()
                && sourceAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            sourceAccount.get().setBalance(sourceAccount.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
