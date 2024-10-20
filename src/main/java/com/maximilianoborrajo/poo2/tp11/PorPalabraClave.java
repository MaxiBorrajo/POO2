/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11;

/**
 *
 * @author maxim
 */
public class PorPalabraClave extends CriterioSubscription {

    @Override
    boolean cumple(Articulo articulo, String valueToCheck) {
        return articulo.getPalabrasClaves().contains(valueToCheck);
    }


    
}
