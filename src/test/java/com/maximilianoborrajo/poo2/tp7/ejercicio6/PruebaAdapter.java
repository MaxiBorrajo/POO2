/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio6;

import java.util.ArrayList;
import java.util.Enumeration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class PruebaAdapter {

    ArrayListPruebaAdapter listAdapter;
    ArrayList<String> list;

    @BeforeEach
    public void setUp() {
        this.list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        this.listAdapter = new ArrayListPruebaAdapter(list);
    }

    @Test
    public void probandoAdapter() {
        Enumeration<String> enumeration = this.listAdapter.asEnumeration(); // Instanciar una vez el adapter
        
        assertTrue(enumeration.hasMoreElements());
        assertEquals("a", enumeration.nextElement());
        assertTrue(enumeration.hasMoreElements());
        assertEquals("b", enumeration.nextElement());
        assertTrue(enumeration.hasMoreElements());
        assertEquals("c", enumeration.nextElement());
        assertFalse(enumeration.hasMoreElements());
    }
}
