/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class Operario {
    double precioPorHora;
    int cantidadHorasTrabajadas;
    int antiguedad;

    public Operario(double precioPorHora, int cantidadHorasTrabajadas, int antiguedad) {
        this.precioPorHora = precioPorHora;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.antiguedad = antiguedad;
    }
    
    double costo(){
        double sueldo = (this.cantidadHorasTrabajadas * this.precioPorHora);
        return  sueldo + this.extraPorAntiguedad(sueldo);
    }

    private double extraPorAntiguedad(double sueldo) {
        return this.antiguedad > 5 ? sueldo * 0.1 : 0;
    }
    
    
}
