package com.farafon.kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test3plus5() {
        String con =Calculator.getResults("3 5 +");
        Assert.assertEquals("8", con);
    }

    @Test
    public void test5time3Minus10() {
        String con =Calculator.getResults("5 3 * 10 -");
        Assert.assertEquals("-5", con);
    }
    @Test
    public void test5time3Minus10DiffOrder() {
        String con =Calculator.getResults("5 10 3 - *");
        Assert.assertEquals("-35", con);
    }
    @Test
    public void testDup() {
        String con =Calculator.getResults("1 2 3 dup");
        Assert.assertEquals("1", con);
    }
    @Test
    public void testDrop() {
        String con =Calculator.getResults("1 2 3 drop");
        Assert.assertEquals("1", con);
    }
    @Test
    public void testBraces() {
        String con =Calculator.getResults("{1 2 3 4}");
    }
}
