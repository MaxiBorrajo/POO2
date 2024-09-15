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
public class IngresoPorHorasExtra extends Ingreso {
    int cantHorasExtra;

    public IngresoPorHorasExtra(int cantHorasExtra, Month mesPercepcion, String concepto, double monto) {
        super(mesPercepcion, concepto, monto);
        this.cantHorasExtra = cantHorasExtra;
    }

    @Override
    public double getMontoImponible() {
        return 0;
    }

}
