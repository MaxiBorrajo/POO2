/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio2;

/**
 *
 * @author maxim
 */
abstract public class Empleado {
    double horasTrabajadas;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    abstract double getPagoPorHora();

    public Empleado(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    abstract double getSueldoBasico();
    
    public double descuentoDeAportesYObraSocial(){
        return 13/100;
    }
    
    abstract double variables();
    
    public double pagoPorHorasTrabajadas(){
        return this.getHorasTrabajadas() * this.getPagoPorHora();
    }
    
    final double sueldo(){
        double sueldoBruto = this.getSueldoBasico() + this.pagoPorHorasTrabajadas() + this.variables();
        return sueldoBruto * (1 - this.descuentoDeAportesYObraSocial());
    }
    
    
}
