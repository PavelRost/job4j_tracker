package ru.job4j.tracker;

public final class SingleTracker {
    private static Tracker tracker = null;

    private SingleTracker() {
    }

    public static Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return SingleTracker.getInstance().add(item);
    }

    public Item[] findAll() {
        return SingleTracker.tracker.findAll();
    }

    public Item[] findByName(String key) {
        return SingleTracker.tracker.findByName(key);
    }

    public Item findById(int id) {
        return SingleTracker.tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return SingleTracker.tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return SingleTracker.tracker.delete(id);
    }
}
