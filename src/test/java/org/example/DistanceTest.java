package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void distance() {
        assertEquals(5.0, Main.distance(0, 3, 0, 4), 0.001); // Пример с использованием теоремы Пифагора
        assertEquals(0.0, Main.distance(0, 0, 0, 0), 0.001); // Точки, которые совпадают
        assertEquals(2.236, Main.distance(1, 2, 1, 3), 0.001); // Пример с использованием теоремы Пифагора
    }
}