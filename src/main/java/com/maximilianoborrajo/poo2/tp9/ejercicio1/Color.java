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

    @Override
    boolean isJugada(List<String> carts) {
        List<String> cartsType = carts.stream().map(c -> c.length() == 3 ? c.substring(2) : c.substring(1)).toList();
        boolean fiveWithSameType = cartsType.stream().anyMatch(i -> Collections.frequency(cartsType, i) == 5);
        return fiveWithSameType;
    }
    
}
