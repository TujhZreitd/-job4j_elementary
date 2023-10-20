package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] result = new int[] {};
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                result = new int[2];
                result[0] = i;
                result[1] = j;
                break;
            }
            if (j == array.length - 1) {
                i++;
                j = 1;
                continue;
            }
            j++;
        }
        return result;
    }
}
