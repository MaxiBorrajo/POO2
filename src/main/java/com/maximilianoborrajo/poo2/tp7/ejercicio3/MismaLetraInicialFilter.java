/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

/**
 *
 * @author maxim
 */
public class MismaLetraInicialFilter extends WikipediaFilter {

    @Override
    boolean isSimilar(IWikipediaPage page, IWikipediaPage wikiPage) {
        return page.getTitle().charAt(0) == wikiPage.getTitle().charAt(0);
    }
    
}
