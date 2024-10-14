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

    public Jugada verificar(List<Carta> carts) {

        Jugada jugada = null;
        List<Jugada> jugadasRestantes = new ArrayList<>(jugadas);
        while (jugada == null && !jugadasRestantes.isEmpty()) {
            jugada = jugadasRestantes.getFirst().verificar(carts);
            jugadasRestantes.removeFirst();
        }

        return jugada;
    }

    public Jugada jugadaGanadora(List<Carta> carts1, List<Carta> carts2) {
        Jugada jugada1 = this.verificar(carts1);
        Jugada jugada2 = this.verificar(carts2);

        if (jugada1.ganaA(jugada2)) {
            return jugada1;
        }

        if (jugada2.ganaA(jugada1)) {
            return jugada2;
        }

        return jugada1.getValor(carts1) > jugada2.getValor(carts2) ? jugada1 : jugada2;
    }

}
