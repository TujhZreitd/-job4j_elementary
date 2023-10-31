package ru.job4j.contidion;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when53to48then5Dot09() {
        double expected = 5.09;
        Point a = new Point(5, 3);
        Point b = new Point(4, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when74to210then7Dot81() {
        double expected = 7.81;
        Point a = new Point(7, 4);
        Point b = new Point(2, 10);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to123then0() {
        double expected = 0;
        Point a = new Point(1, 2, 3);
        Point b = new Point(1, 2, 3);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when003to029then6Dot32() {
        double expected = 0;
        Point a = new Point(1, 2, 3);
        Point b = new Point(1, 2, 3);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}