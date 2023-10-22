package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] result = new int[] {};
        while (i != j) {
            if (array[i] + array[j] == target) {
                result = new int[2];
                result[0] = i;
                result[1] = j;
                break;
            } else if (j == i + 1) {
                i++;
                j = array.length - 1;
            } else {
                j--;
            }
        }
        return result;
    }
}
