/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class Transporte implements Actividad {

    double distancia;
    double carga;
    double precio;

    public Transporte(double distancia, double carga, double precio) {
        this.distancia = distancia;
        this.carga = carga;
        this.precio = precio;
    }

    @Override
    public double costoTotal(MetodoDePago metodoDePago) {
        return this.distancia * this.carga * this.precio;
    }

}
