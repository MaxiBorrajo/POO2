/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp2.ejercicio2;

import com.maximilianoborrajo.poo2.tp2.ejercicio1.EstadoCivil;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado.Empleado;
import java.time.LocalDate;

/**
 *
 * @author maxim
 */
public class EmpleadoContratado extends Empleado {

    int numeroDeContrato;
    MedioDePago medioDePago;

    public EmpleadoContratado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, int numeroDeContrato, MedioDePago medioDePago) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.numeroDeContrato = numeroDeContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public double totalRetenciones() {
        return super.totalRetenciones() + this.retencionGastosAdministrativosContractuales();
    }

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico;
    }

    @Override
    protected double retencionObraSocial() {
        return 0;
    }

    @Override
    protected double retencionAporteJubilatorio() {
        return 0;
    }

    double retencionGastosAdministrativosContractuales() {
        return 50;
    }

    @Override
    protected String generarDesgloseDeConceptos() {
        String sueldoBruto = "Sueldo Bruto: $" + this.sueldoBruto() + "\n";
        String sueldoBase = "- Sueldo Base: $" + this.sueldoBasico + "\n";
        String retenciones = "Retenciones: -$" + this.totalRetenciones() + "\n";
        String obraSocial = " - Obra social: -$" + this.retencionObraSocial() + "\n";
        String aporteJubilatorio = " - Aporte jubilatorio: -$" + this.retencionAporteJubilatorio() + "\n";
        String gastosAdministrativosContractuales = " - Gastos administrativos contractuales: -$" + this.retencionGastosAdministrativosContractuales() + "\n";
        String sueldoNeto = "Sueldo Neto: " + this.sueldoNeto();
        return sueldoBruto + sueldoBase + retenciones + obraSocial + aporteJubilatorio + gastosAdministrativosContractuales + sueldoNeto;
    }

}
