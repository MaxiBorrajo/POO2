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
public class EmpleadoDePlanta extends Empleado {
    int cantHijos;

    public EmpleadoDePlanta(int cantHijos, double horasTrabajadas) {
        super(horasTrabajadas);
        this.cantHijos = cantHijos;
    }

    @Override
    double getPagoPorHora() {
        return 0;
    }

    @Override
    double getSueldoBasico() {
        return 3000;
    }

    @Override
    double variables() {
        return this.cantHijos * 150;
    }
    
}
