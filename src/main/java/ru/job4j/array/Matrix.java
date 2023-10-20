package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int ceil = 0; ceil < size; ceil++) {
                array[row][ceil] = (row + 1) * (ceil + 1);
            }
        }
        return array;
    }
}
