package ru.job4j.tracker;

import java.util.List;
import java.util.Objects;

public class ShowAllAction implements UserAction, Observe<Item> {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    public boolean execute(Input input, Store tracker) {
        out.println("=== Show all items ===");
        tracker.findAll(this);
        return true;
    }

    @Override
    public void receive(Item model) {
        out.println(Objects.requireNonNullElse(model, "Хранилище еще не содержит заявок"));
    }
}
