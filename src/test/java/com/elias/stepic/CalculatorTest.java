package com.elias.stepic;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void whenSum10And8Then18() {
        int a = 10;
        int b = 8;
        int expected = 18;
        int actual = Calculator.sum(a, b);
        Assert.assertThat(expected, Matchers.is(actual));
    }

    @Test
    public void whenMult10And8Then80() {
        int a = 10;
        int b = 8;
        int expected = 80;
        int actual = Calculator.mult(a, b);
        Assert.assertThat(expected, Matchers.is(actual));
    }

}