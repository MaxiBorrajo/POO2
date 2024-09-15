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
public class EmpleadoPlantaPermanente extends Empleado {

    int cantidadHijos;
    int antiguedad;

    public EmpleadoPlantaPermanente(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, int cantidadHijos, int antiguedad) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico + this.asignacionPorHijo() + this.asignacionPorConyuge()
                + this.asignacionPorAntiguedad();
    }

    @Override
    protected double retencionObraSocial() {
        return this.sueldoBruto() * 0.1 + this.cantidadHijos * 20;
    }

    @Override
    protected double retencionAporteJubilatorio() {
        return this.sueldoBruto() * 0.15;
    }

    private int asignacionPorAntiguedad() {
        return 50 * this.antiguedad;
    }

    private int asignacionPorConyuge() {
        return this.estadoCivil.equals(EstadoCivil.Casado) ? 100 : 0;
    }

    private int asignacionPorHijo() {
        return 150 * this.cantidadHijos;
    }

    @Override
    protected String generarDesgloseDeConceptos() {
        String sueldoBruto = "Sueldo Bruto: $" + this.sueldoBruto() + "\n";
        String sueldoBase = "- Sueldo Base: $" + this.sueldoBasico + "\n";
        String asignacionPorHijo = " - Asignación por hijo: $" + this.asignacionPorHijo() + "\n";
        String asignacionPorConyuge = " - Asignación por cónyuge: $" + this.asignacionPorConyuge() + "\n";
        String antiguedad = " - Antiguedad: " + this.asignacionPorAntiguedad() + "\n";
        String retenciones = "Retenciones: -$" + this.totalRetenciones() + "\n";
        String obraSocial = " - Obra social: -$" + this.retencionObraSocial() + "\n";
        String aporteJubilatorio = " - Aporte jubilatorio: -$" + this.retencionAporteJubilatorio() + "\n";
        String sueldoNeto = "Sueldo Neto: " + this.sueldoNeto();
        return sueldoBruto + sueldoBase + asignacionPorHijo + asignacionPorConyuge + antiguedad + retenciones + obraSocial + aporteJubilatorio + sueldoNeto;
    }
}
