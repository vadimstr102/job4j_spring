package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {
    private final Store store;
    private final ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add() {
        store.add(consoleInput.getInput());
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
