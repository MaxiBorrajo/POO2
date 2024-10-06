/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio1;

/**
 *
 * @author maxim
 */
public enum ColorLesionDermatologica {
    MIEL("Piel con necrosis",NivelRiesgo.ALTO),
    AMARILLO("Piel con infeccion",NivelRiesgo.INTERMEDIO),
    GRIS("Piel escamosa",NivelRiesgo.BAJO),
    ROJO("Piel irritada",NivelRiesgo.BAJO)
    ;
    
    String description;
    NivelRiesgo nivelDeRiego;
    ColorLesionDermatologica siguienteColorMaduración;

    private ColorLesionDermatologica(String description, NivelRiesgo nivelDeRiego) {
        this.description = description;
        this.nivelDeRiego = nivelDeRiego;
    }

    public String getDescription() {
        return description;
    }

    public NivelRiesgo getNivelDeRiego() {
        return nivelDeRiego;
    }

    public ColorLesionDermatologica getSiguienteColorMaduración() {
        return siguienteColorMaduración;
    }
    
    static {
        MIEL.siguienteColorMaduración = ROJO;
        AMARILLO.siguienteColorMaduración = MIEL;
        GRIS.siguienteColorMaduración = AMARILLO;
        ROJO.siguienteColorMaduración = GRIS;
    }
}
