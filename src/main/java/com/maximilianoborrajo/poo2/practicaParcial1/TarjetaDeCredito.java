/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class TarjetaDeCredito implements MetodoDePago {

    int cuotas;

    public TarjetaDeCredito(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public double costoTotal(double monto) {
        return monto * (1 + (0.04 * this.cuotas));
    }

}
