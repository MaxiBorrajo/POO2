/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

/**
 *
 * @author maxim
 */
public class ProductoCooperativa extends Producto {

    private double descuento = 0.1;

    public ProductoCooperativa(String nombre, double precio, int stock) throws Exception {
        super(nombre, precio, stock);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * (1 - this.getDescuento());
    }

    private double getDescuento() {
        return this.descuento;
    }
}
