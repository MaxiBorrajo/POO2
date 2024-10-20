/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio3;

/**
 *
 * @author maxim
 */
public interface MP3State {
    public void play(ReproductorMP3 mp3) throws Exception;
    public void pause(ReproductorMP3 mp3);
    public void stop(ReproductorMP3 mp3);
}
