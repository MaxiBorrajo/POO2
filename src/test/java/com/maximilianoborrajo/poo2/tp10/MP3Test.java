/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10;

import com.maximilianoborrajo.poo2.tp10.ejercicio3.EnPausaState;
import com.maximilianoborrajo.poo2.tp10.ejercicio3.ModoSeleccion;
import com.maximilianoborrajo.poo2.tp10.ejercicio3.ReproduciendoState;
import com.maximilianoborrajo.poo2.tp10.ejercicio3.ReproductorMP3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class MP3Test {
    
    ReproductorMP3 mp3;
    
    @BeforeEach
    public void setUp() {
        mp3 = new ReproductorMP3();
    }
    
    @Test
    public void probandoElFlujo() throws Exception{
        assertInstanceOf(ModoSeleccion.class, mp3.getEstado());
        mp3.play();
        assertEquals("pista 1", mp3.getCancionActual().getNombre());
        assertInstanceOf(ReproduciendoState.class, mp3.getEstado());
        assertThrows(Exception.class, mp3::play);
        mp3.pause();
        assertThrows(Exception.class, mp3::play);
        assertInstanceOf(EnPausaState.class, mp3.getEstado());
        mp3.pause();
        assertThrows(Exception.class, mp3::play);
        assertInstanceOf(ReproduciendoState.class, mp3.getEstado());
        mp3.stop();
        assertInstanceOf(ModoSeleccion.class, mp3.getEstado());
    }
}
