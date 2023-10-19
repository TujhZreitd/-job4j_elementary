package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int ceil = 0; ceil < array[row].length; ceil++) {
                if (array[row][ceil] < 0) {
                    array[row][ceil] = 0;
                }
            }
        }
        return array;

    }
}
