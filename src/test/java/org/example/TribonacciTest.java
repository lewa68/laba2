package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciTest {

    @Test
    public void testTribonacciBaseCases() {
        assertEquals(0, Main.tribonacci(0));
        assertEquals(0, Main.tribonacci(1));
        assertEquals(1, Main.tribonacci(2));
    }

    @Test
    public void testTribonacciSmallValues() {
        assertEquals(1, Main.tribonacci(3));
        assertEquals(2, Main.tribonacci(4));
        assertEquals(4, Main.tribonacci(5));
        assertEquals(7, Main.tribonacci(6));
    }

    @Test
    public void testTribonacciLargeValue() {
        assertEquals(755476, Main.tribonacci(25));
    }

    @Test
    public void testTribonacciNegativeValue() {
        assertEquals(0, Main.tribonacci(-1));
    }
}