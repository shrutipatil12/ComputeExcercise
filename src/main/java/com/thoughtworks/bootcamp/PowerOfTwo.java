package com.thoughtworks.bootcamp;

public class PowerOfTwo {
    double result = 1;

    public double compute(int exponent) {
        int i;

        for (i = 0; i < exponent; i++) {
            result *= 2;

        }
        return result;
    }

}
