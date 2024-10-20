/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10.ejercicio2;

/**
 *
 * @author maxim
 */
public class MaquinaDeVideoJuegos {

    MaquinaState estado;
    
    public MaquinaState getEstado() {
        return this.estado;
    }

    public MaquinaDeVideoJuegos() {
        this.estado = new ApagadoState();
    }

    public void setEstado(MaquinaState estado) {
        this.estado = estado;
    }
    
    public void pressStartButton(){
        this.estado.pressStartButton(this);
    }

    public void insertCoin() {
        this.estado.insertCoin(this);
    }
}
