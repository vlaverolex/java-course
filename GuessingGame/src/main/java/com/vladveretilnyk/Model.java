package com.vladveretilnyk;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minBorder;
    private int maxBorder;
    private int guessedNumber;
    private final List<Integer> attempts = new ArrayList<>();

    public void setBorders(int minBorder, int maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }


    public void guessNumber() {
        this.guessedNumber = (int) Math.ceil(Math.random() * (maxBorder - minBorder - 1) + minBorder);
    }

    public int getGuessedNumber() {
        return this.guessedNumber;
    }

    public boolean isGuessedNumber(int number) {
        this.attempts.add(number);

        if (number == this.guessedNumber) {
            return true;
        }

        if (number > this.guessedNumber) {
            this.maxBorder = number;
        } else {
            this.minBorder = number;
        }

        return false;
    }

    public List<Integer> getAttempts() {
        return attempts;
    }
}
