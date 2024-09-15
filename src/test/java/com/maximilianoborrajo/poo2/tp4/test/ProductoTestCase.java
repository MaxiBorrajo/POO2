/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.test;

import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class ProductoTestCase {

    private Producto arroz;
    private Producto vino;

    @BeforeEach
    public void setUp() {
        arroz = new Producto("Arroz", 18.9d, true);
        vino = new Producto("Vino", 55d);
    }

    @Test
    public void testConstructor() {
        assertEquals("Arroz", arroz.getNombre());
        assertEquals(18.9, arroz.getPrecio());
        assertTrue(arroz.esPrecioCuidado());

        assertEquals("Vino", vino.getNombre());
        assertEquals(55, vino.getPrecio());
        assertFalse(vino.esPrecioCuidado());
    }

    @Test
    public void testAumentarPrecio() {
        arroz.aumentarPrecio(1.5);
        assertEquals(20.4, arroz.getPrecio());
    }
}
