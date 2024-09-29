package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void power() {
            assertEquals(8.0, Main.power(2, 3), 0.001); // 2^3 = 8
            assertEquals(1.0, Main.power(5, 0), 0.001); // 5^0 = 1
            assertEquals(27.0, Main.power(3, 3), 0.001); // 3^3 = 27
            assertEquals(0.125, Main.power(2, -3), 0.001); // 2^-3 = 1/2^3 = 0.125
        }

        @Test
        void NegativePower(){
            assertNotEquals(0.5, Main.power(2.0f, -1), "Method should return incorrect result for negative exponent");
        }
        }
