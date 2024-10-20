/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio2;

/**
 *
 * @author maxim
 */
public class ApagadoState implements MaquinaState {
    
    @Override
    public void insertCoin(MaquinaDeVideoJuegos maquina) {
        System.out.println("Insertaste una moneda. Espera otra moneda o presiona iniciar para un jugador.");
        maquina.setEstado(new OnePlayerState());
    }
    
    @Override
    public void pressStartButton(MaquinaDeVideoJuegos maquina) {
        System.out.println("Inserte una ficha para comenzar");
    }
    
}
