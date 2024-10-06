/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio5;

/**
 *
 * @author maxim
 */
public class CuentaCorriente extends CuentaBancaria {

    private int descubierto;

    public CuentaCorriente(String titular, int descubierto) {
        super(titular);
        this.descubierto = descubierto;
    }

    public int getDescubierto() {
        return this.descubierto;
    }

    @Override
    protected boolean condicionDeExtraccion(int monto) {
        return this.getSaldo() + this.getDescubierto() >= monto;
    }

}
