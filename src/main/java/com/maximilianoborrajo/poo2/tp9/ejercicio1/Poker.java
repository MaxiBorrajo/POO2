/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Poker extends Jugada {

    @Override
    boolean isJugada(List<String> carts) {
        List<String> cartsNums = carts.stream().map(c -> c.length() == 3 ? c.substring(0, 2) : c.substring(0, 1)).toList();
        boolean fourWithSameNum = cartsNums.stream().anyMatch(i -> Collections.frequency(cartsNums, i) == 4);
        return fourWithSameNum;
    }

}
