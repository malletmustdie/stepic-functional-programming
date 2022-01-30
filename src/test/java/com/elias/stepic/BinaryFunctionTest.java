package com.elias.stepic;

import org.junit.Assert;
import org.junit.Test;

public class BinaryFunctionTest {

    @Test
    public void whenSumTwoIntegersThenReturnString() {
        Integer i1 = 1;
        Integer i2 = 2;
        String expected = "3";
        BinaryFunction<Integer, Integer, String> function = (num1, num2) -> String.valueOf(num1 + num2);
        String actual = function.apply(i1, i2);
        Assert.assertEquals(expected, actual);
    }

}