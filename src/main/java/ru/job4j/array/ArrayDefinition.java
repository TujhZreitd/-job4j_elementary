package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println(age.length);
        System.out.println(surname.length);
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Egor";
        names[1] = "Anton";
        names[2] = "Alexey";
        names[3] = "Kirill";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
