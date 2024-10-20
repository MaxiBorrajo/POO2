/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio2;

/**
 *
 * @author maxim
 */
public class OnePlayerState implements MaquinaState {

    @Override
    public void insertCoin(MaquinaDeVideoJuegos maquina) {
        System.out.println("Insertó una segunda moneda. Ahora pueden jugar dos jugadores.");
        maquina.setEstado(new TwoPlayerState());
    }

    @Override
    public void pressStartButton(MaquinaDeVideoJuegos maquina) {
         System.out.println("Iniciando juego para un solo jugador.");
         maquina.setEstado(new GameInProcessState());
    }
    
}
