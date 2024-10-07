/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author maxim
 */
public class PokerStatus {

    List<Jugada> jugadas = new ArrayList();

    public void addJugada(Jugada jugada) {
        jugadas.add(jugada);
    }

    public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
        List<String> carts = Arrays.asList(carta1, carta2, carta3, carta4, carta5);

        String jugada = "Nada";
        List<Jugada> jugadasRestantes = new ArrayList<>(jugadas);
        while ("Nada".equals(jugada) && !jugadasRestantes.isEmpty()) {
            jugada = jugadasRestantes.getFirst().verificar(carts);
            jugadasRestantes.removeFirst();
        }

        return jugada;
    }

}
