/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class Empresa {

    String nombre;
    String CUIT;
    MetodoDePago metodoDePago;
    Actividad actividad;

    public Empresa(String nombre, String CUIT, MetodoDePago metodoDePago, Actividad actividad) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.metodoDePago = metodoDePago;
        this.actividad = actividad;
    }

    public double costoDeActividadActual() {
        return this.actividad.costoTotal(this.metodoDePago);
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
