/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio1y2;

import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.Producto;

/**
 *
 * @author maxim
 */
public class ProductoPrimeraNecesidad extends Producto {

    final double descuento;

    public ProductoPrimeraNecesidad(double descuento, String nombre, double precio) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    public ProductoPrimeraNecesidad(double descuento, String nombre, double precio, Boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = descuento;
    }
    
     public ProductoPrimeraNecesidad(String nombre, double precio) {
        super(nombre, precio);
        this.descuento = 0.9;
    }

    public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = 0.9;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * (1 - this.getDescuento());
    }

    private double getDescuento() {
        return this.descuento;
    }
    
    

}
