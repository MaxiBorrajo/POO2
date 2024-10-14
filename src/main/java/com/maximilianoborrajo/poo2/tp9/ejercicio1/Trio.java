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
public class Trio extends Jugada {

    public Trio() {
        super(1);
    }

    @Override
    public boolean isJugada(List<Carta> carts) {
        List<Valor> cartsNums = carts.stream().map(c -> c.getValor()).toList();
        boolean threeWithSameNum = cartsNums.stream().anyMatch(i -> Collections.frequency(cartsNums, i) == 3);
        return threeWithSameNum;
    }

    @Override
    public double getValor(List<Carta> carts) {
        List<Integer> cartsNums = carts.stream().map(c -> c.getValor().getValorCarta()).toList();
        double threeWithSameNum = cartsNums.stream().filter(i -> Collections.frequency(cartsNums, i) == 3).mapToDouble(i -> i).sum();
        return threeWithSameNum;
    }

}
