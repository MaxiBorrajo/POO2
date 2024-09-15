/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3.test;

import com.maximilianoborrajo.poo2.tp3.Multioperador;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
class MultioperadorTestCase {

    ArrayList<Integer> lista = new ArrayList<Integer>(
            Arrays.asList(123, 456, 78));
    Multioperador multioperador = new Multioperador();

    @Test
    void sumar() {
        int amount = multioperador.sumarElementos(lista);
        assertEquals(657, amount);
    }

    @Test
    void restar() {
        int amount = multioperador.restarElementos(lista);
        assertEquals(-657, amount);
    }

    @Test
    void multiplicar() {
        int amount = multioperador.multiplicarElementos(lista);
        assertEquals(4374864, amount);
    }

}
