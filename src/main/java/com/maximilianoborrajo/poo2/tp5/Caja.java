/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

import java.util.List;

/**
 *
 * @author maxim
 */
public class Caja{
    Agencia agencia;

    public Caja(Agencia agencia) {
        this.agencia = agencia;
    }
    
    public double cobrar(List<Pagable> pagables){
        double total = 0;
        
        for(Pagable pagable: pagables){
            total += pagable.montoAPagar();
        }
        
        return total;
    }
}
