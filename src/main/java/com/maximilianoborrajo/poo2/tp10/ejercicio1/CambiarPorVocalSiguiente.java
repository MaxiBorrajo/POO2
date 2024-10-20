/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxim
 */
public class CambiarPorVocalSiguiente implements Encriptacion {

    List<String> vocales = Arrays.asList("a", "e", "i", "o", "u");

    @Override
    public String encriptar(String texto) {
        String[] textoEnPartes = texto.split("");
        String textoConVocalesCambiadas = "";
        for (String letra : textoEnPartes) {
            if (this.isVocal(letra)) {
                textoConVocalesCambiadas = textoConVocalesCambiadas + this.cambiarPorSiguienteVocal(letra);
            } else {
                textoConVocalesCambiadas = textoConVocalesCambiadas + letra;
            }
        }
        return textoConVocalesCambiadas;
    }

    public boolean isVocal(String caracter) {
        return vocales.contains(caracter);
    }

    @Override
    public String desencriptar(String texto) {
        String[] textoEnPartes = texto.split("");
        String textoConVocalesCambiadas = "";
        for (String letra : textoEnPartes) {
            if (this.isVocal(letra)) {
                textoConVocalesCambiadas = textoConVocalesCambiadas + this.cambiarPorVocalAnterior(letra);
            } else {
                textoConVocalesCambiadas = textoConVocalesCambiadas + letra;
            }
        }
        return textoConVocalesCambiadas;
    }

    private String cambiarPorSiguienteVocal(String letra) {
        int indexCurrentVocal = vocales.indexOf(letra);
        return indexCurrentVocal == (vocales.size() - 1) ? vocales.get(0) : vocales.get(indexCurrentVocal + 1);
    }

    private String cambiarPorVocalAnterior(String letra) {
        int indexCurrentVocal = vocales.indexOf(letra);
        return indexCurrentVocal == 0 ? vocales.get((vocales.size() - 1)) : vocales.get(indexCurrentVocal - 1);
    }
}
