/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio3;

/**
 *
 * @author maxim
 */
public class ReproductorMP3 {

    MP3State estado;
    Song cancionActual;

    public ReproductorMP3() {
        this.estado = new ModoSeleccion();
    }

    public MP3State getEstado() {
        return estado;
    }

    public void play() throws Exception {
        estado.play(this);
    }

    public void pause() {
        estado.pause(this);
    }

    public void stop() {
        estado.stop(this);
    }

    public Song getCancionActual() {
        return cancionActual;
    }

    public void setEstado(MP3State estado) {
        this.estado = estado;
    }

    public void setCancionActual(Song cancionActual) {
        this.cancionActual = cancionActual;
    }
}
