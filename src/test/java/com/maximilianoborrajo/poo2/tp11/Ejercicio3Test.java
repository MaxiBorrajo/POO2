/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11;

import com.maximilianoborrajo.poo2.tp11.ejercicio1.Articulo;
import com.maximilianoborrajo.poo2.tp11.ejercicio3.Participante;
import com.maximilianoborrajo.poo2.tp11.ejercicio3.Pregunta;
import com.maximilianoborrajo.poo2.tp11.ejercicio3.SistemaConcursoPreguntas;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 *
 * @author maxim
 */
public class Ejercicio3Test {

    SistemaConcursoPreguntas servidor;
    Participante participante1;
    Participante participante2;
    Participante participante3;
    Participante participante4;
    Participante participante5;
    Pregunta pregunta1;
    Pregunta pregunta2;
    Pregunta pregunta3;
    Pregunta pregunta4;
    Pregunta pregunta5;

    @BeforeEach
    public void setUp() {
        pregunta1 = new Pregunta("¿Cual es el mejor god of war?", "God of war 4");
        pregunta2 = new Pregunta("¿Cual es el mejor kratos?", "Kratos nordico");
        pregunta3 = new Pregunta("¿Cual es el mejor arma?", "Espadas de Atenea");
        pregunta4 = new Pregunta("¿Cual es el mejor jefe?", "Cronos");
        pregunta5 = new Pregunta("¿Cual es el hechizo?", "Furia de poseidon");
        servidor = spy(new SistemaConcursoPreguntas(Arrays.asList(pregunta1, pregunta2, pregunta3, pregunta4, pregunta5)));
        participante1 = spy(new Participante("Gregorio"));
        participante2 = spy(new Participante("Lucila"));
        participante3 = spy(new Participante("Soledad"));
        participante4 = spy(new Participante("Julieta"));
        participante5 = spy(new Participante("Maximiliano"));
        servidor.añadirParticipante(participante1);
        servidor.añadirParticipante(participante2);
        servidor.añadirParticipante(participante3);
        servidor.añadirParticipante(participante4);
        servidor.añadirParticipante(participante5);
    }

    @Test
    public void probarUnGanador() throws Exception {
        participante1.contestarPregunta(servidor, pregunta1, "God of war 4");
        participante1.contestarPregunta(servidor, pregunta2, "Kratos nordico");
        participante5.contestarPregunta(servidor, pregunta2, "Algo");
        participante1.contestarPregunta(servidor, pregunta3, "Espadas de Atenea");
        participante1.contestarPregunta(servidor, pregunta4, "Cronos");
        participante2.contestarPregunta(servidor, pregunta4, "Algo");
        participante1.contestarPregunta(servidor, pregunta5, "Furia de poseidon");
        verify(participante1, times(4)).respuestaCorrecta(any(String.class), any(Pregunta.class));
        verify(participante1, times(5)).recibirNotificacion(any(String.class));
        verify(participante2, times(5)).recibirNotificacion(any(String.class));
        verify(participante3, times(5)).recibirNotificacion(any(String.class));
        verify(participante4, times(5)).recibirNotificacion(any(String.class));
        verify(participante5, times(5)).recibirNotificacion(any(String.class));
    }

    @Test
    public void probarResponderPreguntaQueNoExiste() {
        Pregunta pregunta = new Pregunta("¿Cual es el mejor god of war?", "God of war 3");
        Exception exception = assertThrows(Exception.class, () -> {
            participante1.contestarPregunta(servidor, pregunta, "God of war 4");
        });
        String mensajeEsperado = "Esta pregunta no existe";
        String mensajeReal = exception.getMessage();
        assertEquals(mensajeEsperado, mensajeReal);
    }

    @Test
    public void probarResponderDespuesDeJuegoFinalizado() throws Exception {
        participante1.contestarPregunta(servidor, pregunta1, "God of war 4");
        participante1.contestarPregunta(servidor, pregunta2, "Kratos nordico");
        participante5.contestarPregunta(servidor, pregunta2, "Algo");
        participante1.contestarPregunta(servidor, pregunta3, "Espadas de Atenea");
        participante1.contestarPregunta(servidor, pregunta4, "Cronos");
        participante2.contestarPregunta(servidor, pregunta4, "Algo");
        participante1.contestarPregunta(servidor, pregunta5, "Furia de poseidon");
        Exception exception = assertThrows(Exception.class, () -> {
            participante2.contestarPregunta(servidor, pregunta1, "God of war 4");
        });
        String mensajeEsperado = "El juego ha finalizado";
        String mensajeReal = exception.getMessage();
        assertEquals(mensajeEsperado, mensajeReal);
    }

    @Test
    public void probarResponderSinPreguntas() {
        Participante participante6 = new Participante("Maximo");
        Exception exception = assertThrows(Exception.class, () -> {
            participante6.contestarPregunta(servidor, pregunta5, "Furia de poseidon");
        });
        String mensajeEsperado = "No hay preguntas por responder";
        String mensajeReal = exception.getMessage();
        assertEquals(mensajeEsperado, mensajeReal);

    }
}
