/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio1;

/**
 *
 * @author maxim
 */
public class EncriptacionBase implements Encriptacion {

    @Override
    public String encriptar(String texto) {
        String[] textoEnPartes = texto.split(" ");
        String textoAlReves = "";

        for (int i = (textoEnPartes.length - 1); i >= 0; i--) {
            textoAlReves = textoAlReves + textoEnPartes[i] + " ";
        }

        return textoAlReves.substring(0, textoAlReves.length() - 1);
    }

    @Override
    public String desencriptar(String texto) {
        String[] textoEnPartes = texto.split(" ");
        String textoAlReves = "";

        for (int i = (textoEnPartes.length - 1); i >= 0; i--) {
            textoAlReves = textoAlReves + textoEnPartes[i] + " ";
        }

        return textoAlReves.substring(0, textoAlReves.length() - 1);
    }

}
