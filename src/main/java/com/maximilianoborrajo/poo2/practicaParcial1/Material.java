/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class Material {
    double precio;
    int cantidad;
    
    double costo(){
        return this.precio * this.cantidad;
    }

    public Material(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
