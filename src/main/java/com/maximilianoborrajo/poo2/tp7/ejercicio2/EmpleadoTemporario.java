/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio2;

import com.maximilianoborrajo.poo2.tp7.ejercicio2.Empleado;

/**
 *
 * @author maxim
 */
public class EmpleadoTemporario extends Empleado {
    boolean estaCasado;
    boolean tieneHijos;

    public EmpleadoTemporario(boolean estaCasado, boolean tieneHijos, double horasTrabajadas) {
        super(horasTrabajadas);
        this.estaCasado = estaCasado;
        this.tieneHijos = tieneHijos;
    }

    @Override
    double getPagoPorHora() {
        return 5;
    }

    @Override
    double variables() {
        return this.estaCasado || this.tieneHijos ? 100 : 0;
    }

    @Override
    double getSueldoBasico() {
        return 1000;
    }
    
}
