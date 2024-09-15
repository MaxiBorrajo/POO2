package com.maximilianoborrajo.poo2.tp3.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.maximilianoborrajo.poo2.tp3.Counter;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
class CountTestCase {

    private Counter counter;

    @BeforeEach
    void setUp() throws Exception {
        counter = new Counter();
        // Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.contarCantidadPares();
        // I check the amount is the expected one
        assertEquals(1, amount);

    }

    @Test
    public void testCantidadDigitosPares() {
        // Getting the even occurrences
        ArrayList<Integer> lista = new ArrayList<Integer>(
                Arrays.asList(123, 456, 789, 101112, 131415, 161718, 192021, 222324, 252627, 282930));

        int numero = counter.retornaNumeroMayorCantidadPares(lista);

        // I check the amount is the expected one
        assertEquals(222324, numero);

    }

    @Test
    public void multiploMasGrande() {

        int numero = counter.numeroMasGrandeEntreCeroYMilMultiploDe(3, 9);

        // I check the amount is the expected one
        assertEquals(999, numero);

    }

}
