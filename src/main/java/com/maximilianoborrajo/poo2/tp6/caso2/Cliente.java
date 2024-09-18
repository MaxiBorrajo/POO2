/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
public class Cliente {

    String nombre;
    String apellido;
    String direccion;
    int edad;
    double sueldoNeto;
    double dineroEnCuenta;

    public double getSueldoAnual() {
        return this.getSueldo() * 12;
    }

    public void pedirCredito(Banco banco, SolicitudCredito credito) {
        banco.solicitarCredito(this, credito);
    }

    private void setDineroEnCuenta(double dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    void recibirDinero(double monto) {
        this.setDineroEnCuenta(this.getDineroEnCuenta() + monto);
    }

    private double getDineroEnCuenta() {
        return dineroEnCuenta;
    }

    private double getSueldo() {
        return this.sueldoNeto;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }
}
