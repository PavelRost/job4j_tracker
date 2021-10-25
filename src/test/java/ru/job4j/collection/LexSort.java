package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int indexDot = left.indexOf(".");
        int indexDot2 = right.indexOf(".");
        int numberLeft = Integer.parseInt(left.substring(0, indexDot));
        int numberRight = Integer.parseInt(right.substring(0, indexDot2));
        return Integer.compare(numberLeft, numberRight);
    }
}
