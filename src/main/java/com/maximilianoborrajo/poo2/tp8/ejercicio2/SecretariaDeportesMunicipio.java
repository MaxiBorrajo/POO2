/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author maxim
 */
public class SecretariaDeportesMunicipio {

    private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();

    public void addActividad(ActividadSemanal actividad) {
        actividades.add(actividad);
    }

    public List<ActividadSemanal> actividadesDeFutbol() {
        return this.actividades
                .stream()
                .filter(a -> a.getDeporte().equals(Deporte.FUTBOL))
                .toList();
    }

    public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
        return this.actividades
                .stream()
                .filter(a -> a.getDeporte().getNivelComplejidad() == complejidad)
                .toList();
    }

    public double cantidadHorasTotales() {
        return this.actividades
                .stream()
                .mapToDouble(a -> a.getDuracion())
                .sum();
    }

    public ActividadSemanal actividadDeMenorCostoSegunDeporte(Deporte deporte) {
        return this.actividades
                .stream()
                .filter(a -> a.getDeporte().equals(deporte))
                .min(Comparator.comparing(ActividadSemanal::costo))
                .orElseThrow();
    }

    public Map<Deporte, ActividadSemanal> actividadMasEconomicaPorDeporte() {
        return this.actividades
                .stream()
                .collect(Collectors.groupingBy(
                        ActividadSemanal::getDeporte,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(ActividadSemanal::costo)),
                                Optional::orElseThrow
                        )
                ));
    }
    
    public void imprimirTodasLasActividades(){
        this.actividades.stream().forEach(a -> System.out.println(a.toString()));
    }

}
