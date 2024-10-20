/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio3;

/**
 *
 * @author maxim
 */
public class ModoSeleccion implements MP3State{

    @Override
    public void play(ReproductorMP3 mp3) {
        mp3.setCancionActual(new Song("pista 1"));
        mp3.getCancionActual().play(mp3);
    }

    @Override
    public void pause(ReproductorMP3 mp3) {
        System.out.println("No se ha seleccionado ninguna canción");
    }

    @Override
    public void stop(ReproductorMP3 mp3) {
        System.out.println("No se ha seleccionado ninguna canción");
    }
    
}
