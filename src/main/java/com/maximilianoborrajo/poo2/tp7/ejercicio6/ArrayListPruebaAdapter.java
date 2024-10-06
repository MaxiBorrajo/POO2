/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio6;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author maxim
 */
public class ArrayListPruebaAdapter {
    
    public ArrayList<String> arrayList;

    public ArrayListPruebaAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    
    public Enumeration asEnumeration(){
        IteratorToEnumerationAdapter adapter = new IteratorToEnumerationAdapter(this.arrayList.iterator());
        return adapter;
    }
}
