/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11.ejercicio3;

/**
 *
 * @author maxim
 */
public class Pregunta {

    private String pregunta;
    private String respuesta;

    public boolean esRespuestaCorrecta(String respuesta) {
        return this.respuesta.equals(respuesta);
    }

    public Pregunta(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

}
