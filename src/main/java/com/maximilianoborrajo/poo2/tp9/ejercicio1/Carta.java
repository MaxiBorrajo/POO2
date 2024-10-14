/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Carta {

    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public boolean esMayor(Carta cartaAComparar) {
        return this.getValor().getValorCarta() > cartaAComparar.getValor().getValorCarta();
    }

    public boolean mismoPalo(Carta cartaAComparar) {
        return this.getPalo().equals(cartaAComparar.getPalo());
    }
}
