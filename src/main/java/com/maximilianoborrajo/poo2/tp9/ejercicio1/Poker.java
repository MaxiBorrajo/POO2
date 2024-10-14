/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author maxim
 */
public class Poker extends Jugada {

    public Poker() {
        super(3);
    }

    @Override
    public boolean isJugada(List<Carta> carts) {
        List<Valor> cartsNums = carts.stream().map(c -> c.getValor()).toList();
        boolean fourWithSameNum = cartsNums.stream().anyMatch(i -> Collections.frequency(cartsNums, i) == 4);
        return fourWithSameNum;
    }

    @Override
    public double getValor(List<Carta> carts) {
        List<Integer> cartsNums = carts.stream().map(c -> c.getValor().getValorCarta()).toList();
        double fourWithSameNum = cartsNums.stream().filter(i -> Collections.frequency(cartsNums, i) == 4).mapToDouble(i -> i).sum();
        return fourWithSameNum;
    }

}
