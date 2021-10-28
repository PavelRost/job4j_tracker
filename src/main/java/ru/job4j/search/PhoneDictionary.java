package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {

        BiPredicate<Person, String> predicateName = (p, s) -> p.getName().contains(s);
        BiPredicate<Person, String> predicateSurname = (p, s) -> p.getSurname().contains(s);
        BiPredicate<Person, String> predicatePhone = (p, s) -> p.getPhone().contains(s);
        BiPredicate<Person, String> predicateAddress = (p, s) -> p.getAddress().contains(s);

        BiPredicate<Person, String> combine = predicateName
                .or(predicateSurname)
                .or(predicatePhone)
                .or(predicateAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person, key)) {
                result.add(person);
            }
        }
        return result;
    }
}