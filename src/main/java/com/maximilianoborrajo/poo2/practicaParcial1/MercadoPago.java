/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

/**
 *
 * @author maxim
 */
public class MercadoPago implements MetodoDePago {

    @Override
    public double costoTotal(double monto) {
        return monto * (1 - 0.03);
    }
    
}
