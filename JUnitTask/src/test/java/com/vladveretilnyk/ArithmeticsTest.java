package com.vladveretilnyk;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticsTest {
    private static Arithmetics arithmetics;
    private final double delta = 1e-9;

    @BeforeClass
    public static void init() {
        arithmetics = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double result = arithmetics.add(-5, 10);
        Assert.assertEquals(5, result, delta);
    }

    @Test
    public void testDeduct() {
        double result = arithmetics.deduct(-5, 10);
        Assert.assertEquals(-15, result, delta);
    }

    @Test
    public void testMultiply() {
        double result = arithmetics.multiply(-5, -10);
        Assert.assertEquals(50, result, delta);
    }

    @Test
    public void testDivide() {
        double result = arithmetics.divide(36, 6);
        Assert.assertEquals(6, result, delta);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        arithmetics.divide(5,0);
    }
}
