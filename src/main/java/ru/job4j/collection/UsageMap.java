package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("1234@gmail.com", "Baboo Kolombo");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Email: " + key + ", " + "name: " + value);
        }
    }
}
