package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, -3);
        List<Integer> numbersFilter = numbers.stream().filter(number -> number > 0)
                .collect(Collectors.toList());
    }
}
