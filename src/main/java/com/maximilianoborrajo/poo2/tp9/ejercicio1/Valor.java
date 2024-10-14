/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

/**
 *
 * @author maxim
 */
public enum Valor {
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    J(11),
    Q(12),
    K(13),
    A(14);
    
    private final int valorCarta;

    // Constructor para asignar el valor a cada carta
    private Valor(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    // Método para obtener el valor de la carta
    public int getValorCarta() {
        return valorCarta;
    }
}

