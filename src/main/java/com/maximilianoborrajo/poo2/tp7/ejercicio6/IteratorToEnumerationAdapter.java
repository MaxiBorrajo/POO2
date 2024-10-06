/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio6;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author maxim
 */
public class IteratorToEnumerationAdapter implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorToEnumerationAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }
}