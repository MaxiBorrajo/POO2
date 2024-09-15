/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.test;

import com.maximilianoborrajo.poo2.tp4.ejercicio3.IngresoPorHorasExtra;
import com.maximilianoborrajo.poo2.tp4.ejercicio3.Ingreso;
import com.maximilianoborrajo.poo2.tp4.ejercicio3.Trabajador;
import java.time.Month;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class TrabajadorTest {
    
    private Ingreso sueldoAbril;
    private Ingreso sueldoMayo;
    private IngresoPorHorasExtra horasExtra;
    private Trabajador trabajador;

    @BeforeEach
    public void setUp() {
        sueldoAbril = new Ingreso(Month.APRIL, "Sueldo", 250000);
        sueldoMayo = new Ingreso(Month.MAY, "Sueldo", 250000);
        horasExtra = new IngresoPorHorasExtra(3, Month.APRIL, "Sueldo", 50000);
        trabajador = new Trabajador();
        
    }

    @Test
    public void testCantidadDeProductos() {
        assertEquals(0, trabajador.getImpuestoAPagar());
        assertEquals(0, trabajador.getMontoImponible());
        assertEquals(0, trabajador.getTotalPercibido());
        trabajador.añadirIngreso(sueldoMayo);
        trabajador.añadirIngreso(sueldoAbril);
        trabajador.añadirIngreso(horasExtra);
        assertEquals(10000, trabajador.getImpuestoAPagar());
        assertEquals(500000, trabajador.getMontoImponible());
        assertEquals(550000, trabajador.getTotalPercibido());
    }

    
}
