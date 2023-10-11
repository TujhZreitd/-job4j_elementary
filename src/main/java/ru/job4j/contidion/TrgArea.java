package ru.job4j.contidion;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double d = ((a + b + c) / 2);
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
