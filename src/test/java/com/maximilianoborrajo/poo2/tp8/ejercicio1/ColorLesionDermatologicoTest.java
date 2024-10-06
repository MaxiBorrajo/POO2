/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class ColorLesionDermatologicoTest {

    public ColorLesionDermatologicoTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testColorLesionDermatologico() {
        ColorLesionDermatologica color = ColorLesionDermatologica.AMARILLO;
        assertEquals(color.getDescription(), "Piel con infeccion");
        assertEquals(color.getNivelDeRiego(), NivelRiesgo.INTERMEDIO);
        assertEquals(color.getSiguienteColorMaduración(), ColorLesionDermatologica.MIEL);
        color = ColorLesionDermatologica.MIEL;
        assertEquals(color.getSiguienteColorMaduración(), ColorLesionDermatologica.ROJO);
        color = ColorLesionDermatologica.ROJO;
        assertEquals(color.getSiguienteColorMaduración(), ColorLesionDermatologica.GRIS);
        color = ColorLesionDermatologica.GRIS;
        assertEquals(color.getSiguienteColorMaduración(), ColorLesionDermatologica.AMARILLO);
    }
}
