package ru.job4j.ex;

import org.junit.Test;
import org.junit.Assert;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLessZero() {
        new Fact().calc(-3);
    }

}