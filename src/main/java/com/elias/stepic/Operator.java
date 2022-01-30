package com.elias.stepic;

import java.util.function.BiFunction;

public class Operator {

    private static final BiFunction<Integer, Integer, Integer> BI_FUNCTION = (a, b) -> a < b ? a : b;

    public static Integer getMinimum(Integer i1, Integer i2) {
        return BI_FUNCTION.apply(i1, i2);
    }

}
