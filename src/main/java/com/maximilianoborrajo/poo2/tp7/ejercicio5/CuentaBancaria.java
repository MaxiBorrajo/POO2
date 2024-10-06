/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

    private String titular;
    private int saldo;
    private List<String> movimientos;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<String>();
    }

    public String getTitular() {
        return this.titular;
    }

    public int getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(int monto) {
        this.saldo = monto;
    }

    public void agregarMovimientos(String movimiento) {
        this.movimientos.add(movimiento);
    }

    public final void extraer(int monto) {
        if (this.condicionDeExtraccion(monto)) {
            this.setSaldo(this.getSaldo() - monto);
            this.agregarMovimientos("Extraccion");
        }
    }

    abstract protected boolean condicionDeExtraccion(int monto);
}
