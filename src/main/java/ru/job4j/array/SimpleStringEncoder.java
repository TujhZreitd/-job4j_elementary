package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i) && i < input.length() - 1) {
                counter++;
            } else if (symbol != input.charAt(i) && i == input.length() - 1) {
                if (counter > 1) {
                    result += "" + symbol + counter + input.charAt(i);
                } else {
                    result += "" + symbol + input.charAt(i);
                }
            } else if (symbol == input.charAt(i) && i == input.length() - 1) {
                    result += "" + symbol + (counter + 1);
            } else {
                if (counter > 1) {
                    result += "" + symbol + counter;
                    symbol = input.charAt(i);
                    counter = 1;
                } else {
                    result += "" + symbol;
                    symbol = input.charAt(i);
                    counter = 1;
                }
            }
        }
        return result;
    }
}
