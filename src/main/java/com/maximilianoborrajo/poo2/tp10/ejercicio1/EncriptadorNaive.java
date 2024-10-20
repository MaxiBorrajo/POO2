/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio1;

/**
 *
 * @author maxim
 */
public class EncriptadorNaive {

    private Encriptacion encriptacion;

    public EncriptadorNaive() {
        this.encriptacion = new EncriptacionBase();
    }

    public void setEncriptacion(Encriptacion encriptacion) {
        this.encriptacion = encriptacion;
    }

    public String encriptar(String texto) {
        return this.encriptacion.encriptar(texto);
    }

    public String desencriptar(String texto) {
        return this.encriptacion.desencriptar(texto);
    }
}
