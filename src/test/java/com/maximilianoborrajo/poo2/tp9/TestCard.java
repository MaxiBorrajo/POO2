/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9;

import com.maximilianoborrajo.poo2.tp9.ejercicio1.Carta;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Palo;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Valor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class TestCard {

    Carta carta1;
    Carta carta2;
    Carta carta3;

    @BeforeEach
    public void setUp() {
        this.carta1 = new Carta(Valor.A, Palo.CORAZON);
        this.carta2 = new Carta(Valor.CUATRO, Palo.CORAZON);
        this.carta3 = new Carta(Valor.NUEVE, Palo.TREBOLES);
    }

    @Test
    public void probarQueSonMismoPalo() {
        assertTrue(this.carta1.mismoPalo(carta2));
        assertFalse(this.carta1.mismoPalo(carta3));
    }

    @Test
    public void probarQueEsMayor() {
        assertTrue(this.carta1.esMayor(carta2));
        assertFalse(this.carta2.mismoPalo(carta3));
    }
}
