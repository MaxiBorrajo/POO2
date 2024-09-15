/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class Multioperador {

    public int sumarElementos(ArrayList<Integer> listaEnteros) {
        int valor = 0;

        for (int entero : listaEnteros) {
            valor += entero;
        }

        return valor;
    }

    public int restarElementos(ArrayList<Integer> listaEnteros) {
        int valor = 0;

        for (int entero : listaEnteros) {
            valor -= entero;
        }

        return valor;
    }

    public int multiplicarElementos(ArrayList<Integer> listaEnteros) {
        int valor = 1;

        for (int entero : listaEnteros) {
            valor *= entero;
        }

        return valor;
    }
}
