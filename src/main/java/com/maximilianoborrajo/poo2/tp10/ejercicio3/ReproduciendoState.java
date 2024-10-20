/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxim
 */
public class ReproduciendoState implements MP3State {

    @Override
    public void play(ReproductorMP3 mp3) throws Exception  {
        throw new Exception("Canción ya seleccionada.");
    }

    @Override
    public void pause(ReproductorMP3 mp3) {
        mp3.getCancionActual().pause(mp3);
    }

    @Override
    public void stop(ReproductorMP3 mp3) {
        mp3.getCancionActual().stop(mp3);
    }

}
