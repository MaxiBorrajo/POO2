/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

/**
 *
 * @author maxim
 */
public class Servicio {
    double costoBase;
    private double tasa;
    private double unidadesConsumidas;

    public Servicio(double costoBase, double tasa, double unidadesConsumidas) {
        this.costoBase = costoBase;
        this.tasa = tasa;
        this.unidadesConsumidas = unidadesConsumidas;
    }

    private double getCostoBase() {
        return costoBase;
    }
    
    public double montoAPagar(){
        return this.unidadesConsumidas * this.getCostoBase();
    }

    public double impuesto() {
        return this.tasa;
    }
}
