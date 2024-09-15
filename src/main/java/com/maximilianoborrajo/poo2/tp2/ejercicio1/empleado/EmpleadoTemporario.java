/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado;

import com.maximilianoborrajo.poo2.tp2.ejercicio1.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author maxim
 */
public class EmpleadoTemporario extends Empleado {

    LocalDate fechaFinDesignacion;
    int cantidadHorasExtra;

    public EmpleadoTemporario(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, LocalDate fechaFinDesignacion, int cantidadHorasExtra) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.fechaFinDesignacion = fechaFinDesignacion;
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico + this.pagoTotalPorHorasExtra();
    }

    @Override
    protected double retencionObraSocial() {
        return this.sueldoBruto() * 0.1 + ((this.edad() > 50) ? 25 : 0);
    }

    @Override
    protected double retencionAporteJubilatorio() {
        return this.sueldoBruto() * 0.1 + this.cantidadHorasExtra * 5;
    }

    @Override
    protected String generarDesgloseDeConceptos() {
        String sueldoBruto = "Sueldo Bruto: $" + this.sueldoBruto() + "/n";
        String sueldoBase = "- Sueldo Base: $" + this.sueldoBasico + "/n";
        String horasExtra = " - HorasExtra: $" + this.pagoTotalPorHorasExtra() + "/n";
        String retenciones = "Retenciones: -$" + this.totalRetenciones() + "/n";
        String obraSocial = " - Obra social: -$" + this.retencionObraSocial() + "/n";
        String aporteJubilatorio = " - Aporte jubilatorio: -$" + this.retencionAporteJubilatorio() + "/n";
        String sueldoNeto = "Sueldo Neto: " + this.sueldoNeto();
        return sueldoBruto + sueldoBase + horasExtra + retenciones + obraSocial + aporteJubilatorio + sueldoNeto;
    }

    private int pagoTotalPorHorasExtra() {
        return this.cantidadHorasExtra * 40;
    }
}
