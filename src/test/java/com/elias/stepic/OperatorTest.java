package com.elias.stepic;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTest {

    @Test
    public void when7And6ThenReturn6() {
        int a = 7;
        int b = 6;
        int expected = 6;
        int actual = Operator.getMinimum(a, b);
        Assert.assertEquals(expected, actual);
    }

}