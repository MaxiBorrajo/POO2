/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio5;

/**
 *
 * @author maxim
 */
public class CajaDeAhorro extends CuentaBancaria {

    private int limite;

    public CajaDeAhorro(String titular, int limite) {
        super(titular);
        this.limite = limite;
    }

    public int getLimite() {
        return this.limite;
    }

    @Override
    protected boolean condicionDeExtraccion(int monto) {
        return this.getSaldo() >= monto && this.getLimite() >= monto;
    }
}
