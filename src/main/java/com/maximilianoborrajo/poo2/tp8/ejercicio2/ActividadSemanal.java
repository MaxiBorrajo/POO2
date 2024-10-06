/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

/**
 *
 * @author maxim
 */
public class ActividadSemanal {

    private DiaSemana diaDeLaSemana;
    private LocalTime horaInicio;
    private double duracion;
    private Deporte deporte;

    public ActividadSemanal(DiaSemana diaDeLaSemana, LocalTime horaInicio, double duracion, Deporte deporte) {
        this.diaDeLaSemana = diaDeLaSemana;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public double costo() {
        return this.costoDiaSemana() + this.costoPorComplejidad();
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public DiaSemana getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    private double costoDiaSemana() {
        if (Arrays.asList(DiaSemana.LUNES, DiaSemana.MARTES, DiaSemana.MIERCOLES).contains(this.diaDeLaSemana)) {
            return 500;
        }

        return 1000;
    }

    private double costoPorComplejidad() {
        return 200 * this.deporte.getNivelComplejidad();
    }

    @Override
    public String toString() {
        return "Deporte: " + 
                this.getDeporte() + 
                ". Dia: " + 
                this.getDiaDeLaSemana() + 
                " A LAS: " + 
                this.getHoraInicio() + 
                " . Duración: " + 
                this.getDuracion() + 
                " hora(s).";
    }
}
