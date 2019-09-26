package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {
    @Test
    void givenNumberAsTwo_WhenCalculatePower_ThenShouldReturnOne() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(1, power.compute(0));
    }

    @Test
    void givenPositiveNumber_WhenCalculatePower_ThenShouldReturnFour() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(4, power.compute(2));
    }

    @Test
    void givenPositiveNumber_WhenCalculatePower_ThenShouldReturnSixten() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(16, power.compute(4));
    }

    @Test
    void givenNegativeNumber_WhenCalculatePower_ThenShouldReturnZeroDotTwoFive() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(0.25, power.computeNegativeExponent(-2));
    }
}
