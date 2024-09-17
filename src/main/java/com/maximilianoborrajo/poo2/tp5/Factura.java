/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Factura implements Pagable {
    List<Servicio> servicios = new ArrayList<Servicio>();
    
    public void añadirServicio(Servicio servicio){
        this.servicios.add(servicio);
    }

    @Override
    public double montoAPagar() {
        double total = 0;
        
        for(Servicio servicio: this.servicios){
            total += servicio.montoAPagar() + servicio.impuesto();
        }
        
        return total;
    }
    
}
