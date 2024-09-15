/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio3;

import java.time.Month;

/**
 *
 * @author maxim
 */
public class Ingreso {

    Month mesPercepcion;
    String concepto;
    double monto;

    public Ingreso(Month mesPercepcion, String concepto, double monto) {
        this.mesPercepcion = mesPercepcion;
        this.concepto = concepto;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public double getMontoImponible() {
        return this.getMonto();
    }

}
