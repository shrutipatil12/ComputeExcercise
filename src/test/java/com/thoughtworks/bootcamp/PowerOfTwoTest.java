package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {
    @Test
    void givenNumberAsTwo_WhenComputePowerOfZero_ThenShouldReturnOne() {
        PowerOfTwo power = new PowerOfTwo();
        assertEquals(1, power.compute(0));
    }

}
