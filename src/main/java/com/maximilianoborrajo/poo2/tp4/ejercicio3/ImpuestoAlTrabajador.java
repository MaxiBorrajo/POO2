/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio3;

/**
 *
 * @author maxim
 */
public class ImpuestoAlTrabajador {
    public double getMontoAPagar(Trabajador trabajador){
        return trabajador.getMontoImponible() * 0.02;
    }
}
