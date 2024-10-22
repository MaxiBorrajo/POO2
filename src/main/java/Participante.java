/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Participante {
    private List<Pregunta> preguntas = null;
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void contestarPregunta(SistemaConcursoPreguntas sistema, Pregunta pregunta, String respuesta) throws Exception{
        if(this.preguntas == null || this.preguntas.isEmpty()){
            throw new Exception("No hay preguntas por responder");
        }
        
        if(!this.preguntas.contains(pregunta)){
            throw new Exception("Esta pregunta no existe");
        }
        
        sistema.contestarPregunta(pregunta, respuesta, this);
    }

    public void obtenerPreguntas(List<Pregunta> preguntas) {
        if(this.preguntas == null){
            this.preguntas = new ArrayList<>(preguntas);
        }
    }

    public void respuestaCorrecta(String respuesta, Pregunta pregunta) {
        System.out.println(respuesta);
        if(this.preguntas != null){
            this.preguntas.remove(pregunta);
        }
        
    }
    
    public void recibirNotificacion(String notificacion){
        System.out.println(notificacion);
    }

    boolean esUltimaPregunta(Pregunta pregunta) {
        return this.preguntas.size() == 1 && this.preguntas.contains(pregunta);
    }
}
