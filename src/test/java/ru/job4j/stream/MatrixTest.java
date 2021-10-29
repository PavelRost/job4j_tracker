package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void whenCollectMatrixToList() {
        Integer[][] matrix = new Integer[][] {{1, 2}, {3, 4}};
        Matrix mx = new Matrix();
        List<Integer> rsl = mx.matrixToList(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(rsl, is(expected));
    }
}