package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int ceil = 0; ceil < array[row].length; ceil++) {
                array[row][ceil] = (row + 1) * (ceil + 1);
            }
        }
        return array;
    }
}
