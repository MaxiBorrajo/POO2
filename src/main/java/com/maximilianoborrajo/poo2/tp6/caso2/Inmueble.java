/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
class Inmueble {
    String descripcion;
    String direccion;
    double valorFiscal;

    public Inmueble(String descripcion, String direccion, double valorFiscal) {
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.valorFiscal = valorFiscal;
    }

    public double getValorFiscal() {
        return valorFiscal;
    }
    
    
}
