/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio3;

/**
 *
 * @author maxim
 */
public class Song implements MP3State {

    String nombre;

    public Song(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public void play(ReproductorMP3 mp3) {
        System.out.println("Reproduciendo cancion");
        mp3.setEstado(new ReproduciendoState());
    }

    @Override
    public void pause(ReproductorMP3 mp3) {
        System.out.println("Pausando cancion");
        mp3.setEstado(new EnPausaState());
    }

    @Override
    public void stop(ReproductorMP3 mp3) {
        System.out.println("Llendo a reproducción de canciones.");
        mp3.setEstado(new ModoSeleccion());
    }
    
}
