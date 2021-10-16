package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance2Dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance4Dot47() {
        Point a = new Point(1, 2);
        Point b = new Point(5, 4);
        double result = a.distance(b);
        double expected = 4.47;
        Assert.assertEquals(expected, result, 0.01);
    }

}