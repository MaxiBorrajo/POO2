/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Color extends Jugada{

    public Color() {
        super(2);
    }

    @Override
    public boolean isJugada(List<Carta> carts) {
        List<Palo> cartsType = carts.stream().map(c -> c.getPalo()).toList();
        boolean fiveWithSameType = cartsType.stream().anyMatch(i -> Collections.frequency(cartsType, i) == 5);
        return fiveWithSameType;
    }

    @Override
    public double getValor(List<Carta> carts) {
        double value = carts.stream().mapToDouble(c -> c.getValor().getValorCarta()).sum();
        return value;
    }
    
}
