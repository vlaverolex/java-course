package com.vladveretilnyk;

public class Model {

    public boolean isValid(String word, int index) {
        String firstWord = "Hello";
        String secondWord = "world!";

        return (index == 1 && word.equals(firstWord)) ||
                (index == 2 && word.equals(secondWord));
    }

    public String uniteWords(String[] words) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);

            if (i < words.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
