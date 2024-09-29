package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangle() {
        // Тесты на треугольники
        assertTrue(Main.triangle(3, 4, 5)); // Пример треугольника по теореме Пифагора
        assertTrue(Main.triangle(1, 1, 1)); // Треугольник со сторонами 1, 1, 1
        assertTrue(Main.triangle(10, 10, 14)); // Пример треугольника, который существует

        // Тесты на не-треугольники
        assertFalse(Main.triangle(1, 2, 3)); // Несуществующий треугольник
        assertFalse(Main.triangle(0, 0, 0)); // Треугольник с нулевыми сторонами
        assertFalse(Main.triangle(-2, -2, -5)); // Несуществующий треугольник
    }
}