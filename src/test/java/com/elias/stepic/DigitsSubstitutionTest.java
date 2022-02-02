package com.elias.stepic;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class DigitsSubstitutionTest {

    @Test
    public void whenSubstitution12765Then12321() {
        int num = 12765;
        int expected = 12321;
        Function<Integer, Integer> function = digit -> digit > 4 ? digit - 4 : digit;
        int actual = DigitsSubstitution.substitution(num, function);
        Assert.assertEquals(expected, actual);
    }

}