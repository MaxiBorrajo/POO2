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
public class EmpleadoPasante extends Empleado {

    public EmpleadoPasante(double horasTrabajadas) {
        super(horasTrabajadas);
    }

    @Override
    double getPagoPorHora() {
        return 40;
    }

    @Override
    double getSueldoBasico() {
        return 0;
    }

    @Override
    double variables() {
        return 0;
    }
    
}
