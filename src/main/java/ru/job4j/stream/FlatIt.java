package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return iteratorToStream(it)
                .filter(Iterator::hasNext)
                .map(Iterator::next)
                .collect(Collectors.toList());

//        return iteratorToStream(it)
//                .flatMap(f -> Stream.of(f.next()))
//                .collect(Collectors.toList());//
//        return iteratorToStream(it)
//                .map(Iterator::next)
//                .collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
    }
}
