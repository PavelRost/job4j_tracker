package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsWithoutNull = Arrays.copyOf(items, size);
        Item[] itemEqualsKey = new Item[itemsWithoutNull.length];
        int size = 0;
        for (Item item : itemsWithoutNull) {
            if (item.getName().equals(key)) {
                itemEqualsKey[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemEqualsKey, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}