/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11.ejercicio3;

import com.maximilianoborrajo.poo2.tp3.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author maxim
 */
public class SistemaConcursoPreguntas {

    private int cantidadParticipantesRestantes;
    private List<Participante> participantes;
    private List<Pregunta> preguntas;
    private boolean juegoCorriendo;
    private Map<Participante, Integer> conteoParticipantes;

    public SistemaConcursoPreguntas(List<Pregunta> preguntas) {
        this.juegoCorriendo = true;
        this.conteoParticipantes = new HashMap<>();
        this.participantes = new ArrayList<>();
        this.preguntas = preguntas;
        this.cantidadParticipantesRestantes = 5;
    }

    public void terminarJuego() {
        this.juegoCorriendo = false;
    }

    public void añadirParticipante(Participante participante) {
        if (this.sePuedeAñadirParticipante()) {
            this.participantes.add(participante);
            this.conteoParticipantes.put(participante, 0);
            participante.obtenerPreguntas(this.preguntas);
            this.cantidadParticipantesRestantes -= 1;
        }
    }

    private boolean sePuedeAñadirParticipante() {
        return this.cantidadParticipantesRestantes > 0 && this.juegoCorriendo;
    }

    public void contestarPregunta(Pregunta pregunta, String respuesta, Participante participante) throws Exception {
        if (!this.juegoCorriendo) {
            throw new Exception("El juego ha finalizado");
        }

        boolean esRespuestaCorrecta = pregunta.esRespuestaCorrecta(respuesta);

        if (esRespuestaCorrecta) {
            int conteoParticipante = this.conteoParticipantes.get(participante);
            this.conteoParticipantes.put(participante, conteoParticipante++);
            this.notificarParticipantes(participante, pregunta);
        }

    }

    private void notificarParticipantes(Participante participante, Pregunta pregunta) {
        if (participante.esUltimaPregunta(pregunta)) {
            this.terminarJuego();
            this.notificarGanador(participante.getNombre());
        } else {
            participante.respuestaCorrecta("Respondiste Correctamente.", pregunta);
            this.notificarRespuestaCorrecta(pregunta.getPregunta(), participante.getNombre());
        }
    }

    private void notificarRespuestaCorrecta(String pregunta, String nombre) {
        this.participantes.stream().forEach((p) -> {
            p.recibirNotificacion("El jugador " + nombre + " a contestado correctamente " + pregunta);
        });
    }

    private void notificarGanador(String nombre) {
        this.participantes.stream().forEach((p) -> {
            p.recibirNotificacion("El jugador " + nombre + " ha ganado la partida");
        });
    }
}
