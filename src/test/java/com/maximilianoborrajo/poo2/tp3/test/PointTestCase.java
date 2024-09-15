/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3.test;

import com.maximilianoborrajo.poo2.tp3.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
class PointTestCase {

    Point point = new Point();

    @BeforeEach
    void setUp() throws Exception {
        point.setX(-5);
        point.setY(10);
    }

    @Test
    void mover() {
        point.setX(5);
        point.setY(-10);

        assertEquals(5, point.getX());
        assertEquals(-10, point.getY());
    }

    @Test
    void sumar() {
        Point newPoint = point.sum(new Point(10, 15));
        assertEquals(5, newPoint.getX());
        assertEquals(25, newPoint.getY());
    }
}
