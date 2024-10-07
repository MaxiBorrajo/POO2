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

    public String verificar(List<String> carts) {
        return isJugada(carts) ? this.getClass().getSimpleName() : "Nada";
    }

    abstract boolean isJugada(List<String> carts);
}
