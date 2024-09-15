/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.test;

import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.ProductoPrimeraNecesidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class ProductoPrimeraNecesidadTest {

    private ProductoPrimeraNecesidad leche;

    @BeforeEach
    public void setUp() {
        leche = new ProductoPrimeraNecesidad(0.11, "Leche", 8d, false);
    }

    @Test
    public void testCalcularPrecio() {
        assertEquals(7.12, leche.getPrecio());
    }
}
