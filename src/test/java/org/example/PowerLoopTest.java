package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLoopTest {

    @Test
    void powerLoop() {
        assertEquals(8.0, Main.powerLoop(2, 3), 0.001); // 2^3 = 8
        assertEquals(1.0, Main.powerLoop(5, 0), 0.001); // 5^0 = 1
        assertEquals(27.0, Main.powerLoop(3, 3), 0.001); // 3^3 = 27
        assertEquals(0.125, Main.powerLoop(2, -3), 0.001); // 2^-3 = 1/2^3 = 0.125
    }

    @Test
        void NegativePowerLoop(){
        assertEquals(-1,Main.powerLoop(0,-1));
    }
}