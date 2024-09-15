/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3.test;

import com.maximilianoborrajo.poo2.tp3.Cuadrado;
import com.maximilianoborrajo.poo2.tp3.Rectangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
class RectanguloTestCase {

    Rectangulo rectangulo = new Rectangulo(1, 5);
    Cuadrado cuadrado = new Cuadrado(1);

    @BeforeEach
    void setUp() throws Exception {

    }

    @Test
    void test() {
        assertEquals(5, rectangulo.area());
        assertEquals(12, rectangulo.perimetro());
        assertEquals(true, rectangulo.esHorizontal());
        assertEquals(1, cuadrado.area());
        assertEquals(4, cuadrado.perimetro());
        assertEquals(false, cuadrado.esHorizontal());
    }

}
