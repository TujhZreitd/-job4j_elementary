package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int ceil = 0; ceil < array[row].length; ceil++) {
                rsl += array[row][ceil];
            }
        }
        return rsl;
    }
}
