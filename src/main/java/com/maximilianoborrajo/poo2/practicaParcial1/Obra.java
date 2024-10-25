/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

import java.util.List;

/**
 *
 * @author maxim
 */
public class Obra implements Actividad {
    
    List<Material> materiales;
    List<Operario> operarios;

    public Obra(List<Material> materiales, List<Operario> operarios) {
        this.materiales = materiales;
        this.operarios = operarios;
    }

    @Override
    public double costoTotal(MetodoDePago metodoDePago) {
        double costoFinal = this.calcularSueldoOperarios() + this.calcularCostoMateriales();
        return metodoDePago.costoTotal(costoFinal);
    }

    private double calcularSueldoOperarios() {
        return this.operarios.stream().mapToDouble(o -> o.costo()).sum();
    }

    private double calcularCostoMateriales() {
        return this.materiales.stream().mapToDouble(m -> m.costo()).sum();
    }

}
