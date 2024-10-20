/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxim
 */
public class LetrasPorNumeros implements Encriptacion {

    List<String> abecedario = Arrays.asList(
            " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    );

    @Override
    public String encriptar(String texto) {
        String[] textoEnPartes = texto.toLowerCase().split("");
        String textoConLetrasCambiadas = "";

        for (String letra : textoEnPartes) {
            textoConLetrasCambiadas = textoConLetrasCambiadas + abecedario.indexOf(letra) + ",";
        }

        return textoConLetrasCambiadas.substring(0, textoConLetrasCambiadas.length() - 1);
    }

    @Override
    public String desencriptar(String texto) {
        String[] textoEnPartes = texto.split(",");
        String textoConLetrasCambiadas = "";

        for (String letra : textoEnPartes) {
            textoConLetrasCambiadas = textoConLetrasCambiadas + abecedario.get(Integer.parseInt(letra));
        }

        return textoConLetrasCambiadas;
    }

}
