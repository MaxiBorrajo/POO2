/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio1y2;

/**
 *
 * @author maxim
 */
public class Producto {

    String nombre;
    double precio;
    Boolean esPrecioCuidado = false;

    public Producto(String nombre, double precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, Boolean esPrecioCuidado) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public Boolean esPrecioCuidado() {
        return this.esPrecioCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void aumentarPrecio(double cantidad) {
        this.setPrecio(this.getPrecio() + cantidad);
    }

}
