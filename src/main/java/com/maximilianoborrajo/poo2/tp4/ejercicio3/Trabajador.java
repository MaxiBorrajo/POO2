/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Trabajador {
    List<Ingreso> ingresosPercibidosAlAño = new ArrayList<Ingreso>();
    
    public void añadirIngreso(Ingreso ingreso){
        ingresosPercibidosAlAño.add(ingreso);
    }

    public double getMontoImponible() {
        double total = 0;
        
        for(Ingreso ingreso: this.ingresosPercibidosAlAño){
            total += ingreso.getMontoImponible();
        }
        
        return total;
    }
    
    public double getTotalPercibido() {
        double total = 0;
        
        for(Ingreso ingreso: this.ingresosPercibidosAlAño){
            total += ingreso.getMonto();
        }
        
        return total;
    }
    
    public double getImpuestoAPagar() {
        return new ImpuestoAlTrabajador().getMontoAPagar(this);
    }
    
}
