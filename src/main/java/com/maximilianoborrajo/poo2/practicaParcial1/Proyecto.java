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
public class Proyecto implements Actividad {

    List<Actividad> proyectos;

    public Proyecto(List<Actividad> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public double costoTotal(MetodoDePago metodoDePago) {
        double costoFinal = this.proyectos.stream().mapToDouble(p -> p.costoTotal(metodoDePago)).sum();

        return costoFinal;
    }

}
