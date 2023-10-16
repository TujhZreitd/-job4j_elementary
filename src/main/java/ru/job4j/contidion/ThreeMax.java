package ru.job4j.contidion;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second >= third) {
            result = second;
        } else if (third > first && third >= second) {
            result = third;
        }
        return result;
    }
}
