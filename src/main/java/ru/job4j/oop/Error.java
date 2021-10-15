package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        Error errorTwo = new Error(true, 1, "PC dead");
        Error errorThree = new Error(false, 0, "Ошибка не активна");
        Error errorFour = new Error(true, 2, "Critical error");
        errorOne.printInfo();
        errorTwo.printInfo();
        errorThree.printInfo();
        errorFour.printInfo();
    }
}
