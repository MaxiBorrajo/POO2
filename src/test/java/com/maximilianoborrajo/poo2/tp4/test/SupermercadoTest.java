/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.test;

import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.Producto;
import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.Supermercado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class SupermercadoTest {

    private Producto arroz;
    private Producto detergente;
    private Supermercado supermercado;

    @BeforeEach
    public void setUp() {
        arroz = new Producto("Arroz", 18.9d, true);
        detergente = new Producto("Detergente", 75d);
        supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
        
    }

    @Test
    public void testCantidadDeProductos() {
        assertEquals(0, supermercado.getCantidadDeProductos());
        supermercado.agregarProducto(arroz);
        supermercado.agregarProducto(detergente);
        assertEquals(2, supermercado.getCantidadDeProductos());
    }

    @Test
    public void testPrecioTotal() {
        assertEquals(0, supermercado.getPrecioTotal());
        supermercado.agregarProducto(arroz);
        supermercado.agregarProducto(detergente);
        assertEquals(93.9, supermercado.getPrecioTotal());
    }
}
