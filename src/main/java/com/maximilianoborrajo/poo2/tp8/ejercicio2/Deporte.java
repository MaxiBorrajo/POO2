/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio2;

/**
 *
 * @author maxim
 */
public enum Deporte {
    RUNNING(1),
    FUTBOL(2),
    BASKET(2),
    TENNIS(3),
    JABALINA(4);

    private int nivelComplejidad;

    private Deporte(int nivelComplejidad) {
        this.nivelComplejidad = nivelComplejidad;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }
}
