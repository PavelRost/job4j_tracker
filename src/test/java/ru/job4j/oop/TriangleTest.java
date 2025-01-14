package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void area8Dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void areaMinus1() {
        Point a = new Point(1, 1);
        Point b = new Point(0, 0);
        Point c = new Point(100, 100);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}