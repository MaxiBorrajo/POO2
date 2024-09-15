/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

/**
 *
 * @author maxim
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(double tamaño, Point origen) {
        super(origen, tamaño, tamaño);
    }

    public Cuadrado(double tamaño) {
        super(tamaño, tamaño);
    }
}
