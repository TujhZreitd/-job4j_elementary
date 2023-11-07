package ru.job4j.contidion;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int left, int leftMiddle, int rightMiddle, int right) {
        return max(left, max(leftMiddle, rightMiddle, right));
    }
}
