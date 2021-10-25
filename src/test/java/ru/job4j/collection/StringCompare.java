package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char charLeft;
        char charRight;
        int length = Math.min(left.length(), right.length());
        int rsl = 0;
        int rsl2 = Integer.compare(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            charLeft = left.charAt(i);
            charRight = right.charAt(i);
            rsl = Character.compare(charLeft, charRight);
            if (rsl != 0) {
                return rsl;
            }
        }
        if (rsl2 == -1) {
            rsl = -1;
        } else if (rsl2 == 1) {
            rsl = 1;
        }
        return rsl;
    }
}
