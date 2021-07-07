package com.vladveretilnyk;

public class View {
    public static final String INPUT_FIRST_WORD = "Input \"Hello\":";
    public static final String INPUT_SECOND_WORD = "Input \"world!\":";
    public static final String INPUT_WRONG = "Wrong! Try again!";
    public static final String INPUT_END = "Input end";
    public static final String RESULT = "United words:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, String text) {
        System.out.println(message + " " + text);
    }
}
