package com.vladveretilnyk;

import java.util.List;

public class View {
    public static final String START_MESSAGE = "The number is riddled. Try guessing it";
    public static final String INPUT_NUMBER = "Input a number";
    public static final String INPUT_WRONG = "It's not a number! Try again!";
    public static final String STATISTICS = "Statistics";
    public static final String VICTORY = "You win! Guessed number is";
    public static final String BETWEEN = "between";
    public static final String AND = "and";


    public static final String SPACE_SING = " ";
    public static final String OPENS_SQUARE_BRACKET = "]";
    public static final String CLOSING_SQUARE_BRACKET = "[";
    public static final String COLON = ":";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String convertToString(List<Integer> attempts) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < attempts.size(); i++) {
            builder.append(attempts.get(i));

            if (i < attempts.size() - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    public String getInputNumberStringMessage(int minBorder, int maxBorder) {
        return INPUT_NUMBER + SPACE_SING +
                BETWEEN + SPACE_SING +
                minBorder + SPACE_SING +
                AND + SPACE_SING + maxBorder;
    }
}
