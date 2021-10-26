package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            if (value.contains("/")) {
                String[] temp = value.split("/");
                for (int i = 0; i < temp.length; i++) {
                    if (i == 0) {
                        start = temp[i];
                        tmp.add(start);
                    } else {
                        tmp.add(start + "/" + temp[i]);
                    }

                }
            } else {
                start = value;
                tmp.add(start);
            }

        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
