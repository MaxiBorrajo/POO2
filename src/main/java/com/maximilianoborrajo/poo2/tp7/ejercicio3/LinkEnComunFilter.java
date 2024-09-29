/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

/**
 *
 * @author maxim
 */
public class LinkEnComunFilter extends WikipediaFilter {

    @Override
    boolean isSimilar(IWikipediaPage page, IWikipediaPage wikiPage) {
        return page.getLinks().stream().anyMatch((p)
                -> wikiPage.getLinks().contains(p));
    }

}
