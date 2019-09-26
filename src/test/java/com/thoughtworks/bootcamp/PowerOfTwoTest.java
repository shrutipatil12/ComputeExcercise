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
    void givenPositiveNumber_WhenCalculatePower_ThenShouldReturnOne() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(4, power.compute(2));
    }

    @Test
    void givenPositiveNumber_WhenCalculatePower_ThenShouldReturnTwo() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(16, power.compute(4));
    }


}
