package com.vladveretilnyk;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
    private static Model model;

    @BeforeClass
    public static void init() {
        model = new Model();
        model.setBorders(GlobalConstants.MIN_BORDER, GlobalConstants.MAX_BORDER);
    }

    @Test
    public void guessedNumbersShouldBeInRange() {
        for (int i = 0; i < 10000; i++) {
            model.guessNumber();
            int guessedNumber = model.getGuessedNumber();
            boolean isInRange = guessedNumber > model.getMinBorder() && guessedNumber < model.getMaxBorder();
            Assert.assertTrue(isInRange);
        }
    }

    @Test
    public void matchWithGuessedNumberShouldReturnPositiveResult() {
        for (int i = 0; i < 10000; i++) {
            model.guessNumber();
            int guessedNumber = model.getGuessedNumber();
            Assert.assertTrue(model.isGuessedNumber(guessedNumber));
        }
    }

    @Test
    public void mismatchWithGuessedNumberShouldReturnNegativeResult() {
        for (int i = 0; i < 1000; i++) {
            model.guessNumber();
            for (int j = GlobalConstants.MIN_BORDER + 1; j < GlobalConstants.MAX_BORDER; j++) {
                if (j == model.getGuessedNumber()) continue;
                Assert.assertFalse(model.isGuessedNumber(j));
            }
        }
    }
}
