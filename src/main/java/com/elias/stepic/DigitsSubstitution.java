package com.elias.stepic;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class DigitsSubstitution {

    public static int substitution(long n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }
        return result;
    }

    public static void main(String[] args) {
        Supplier<String> s = () -> "hyi 1";
        System.out.println(s.get());

        Consumer<Integer> c = (num1) -> System.out.println(num1 + " hyi");
        c.accept(1);
    }

}
