/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.List;

/**
 *
 * @author maxim
 */
abstract public class Jugada {
    int valor;

    public double getValor() {
        return valor;
    }
    
    abstract public double getValor(List<Carta> carts);

    public Jugada(int valor) {
        this.valor = valor;
    }

    public Jugada verificar(List<Carta> carts) {
        return isJugada(carts) ? this : null;
    }

    abstract public boolean isJugada(List<Carta> carts);
    
    public boolean ganaA(Jugada jugada){
        return jugada == null || this.getValor() > jugada.getValor();
    }
}
