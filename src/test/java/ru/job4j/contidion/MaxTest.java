package ru.job4j.contidion;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To4Then4() {
        int left = 3;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To4Then4() {
        int left = 3;
        int middle = 3;
        int right = 4;
        int result = Max.max(left, middle, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int left = 1;
        int leftMiddle = 2;
        int rightMiddle = 3;
        int right = 4;
        int result = Max.max(left, leftMiddle, rightMiddle, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}