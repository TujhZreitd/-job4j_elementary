package ru.job4j.contidion;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        int referent = max(middle, right);
        return left > referent ? left : referent;
    }

    public static int max(int left, int leftMiddle, int rightMiddle, int right) {
        int referent = max(leftMiddle, rightMiddle, right);
        return left > referent ? left : referent;
    }
}
