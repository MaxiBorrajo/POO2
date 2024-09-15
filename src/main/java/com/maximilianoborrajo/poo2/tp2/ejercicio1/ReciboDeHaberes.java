package com.maximilianoborrajo.poo2.tp2.ejercicio1;

import java.time.LocalDate;

public class ReciboDeHaberes {

    String nombreDelEmpleado;
    String direccion;
    LocalDate fechaDeEmision = LocalDate.now();
    double sueldoBruto;
    double sueldoNeto;
    String desgloseDeConceptos;

    public ReciboDeHaberes(String nombreDelEmpleado, String direccion, double sueldoBruto, double sueldoNeto,
            String desgloseDeConceptos) {
        this.nombreDelEmpleado = nombreDelEmpleado;
        this.direccion = direccion;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
        this.desgloseDeConceptos = desgloseDeConceptos;
    }

    public String mostrarDetalles() {
        return "Nombre: " + nombreDelEmpleado + "\n"
                + "Dirección: " + direccion + "\n"
                + "Fecha de Emisión: " + fechaDeEmision + "\n"
                + "Sueldo Bruto: " + sueldoBruto + "\n"
                + "Sueldo Neto: " + sueldoNeto + "\n"
                + "Desglose de Conceptos: " + desgloseDeConceptos + "\n";
    }

}
