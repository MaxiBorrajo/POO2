/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class Ejercicio3 {

    private WikipediaPage bernal = new WikipediaPage("Bernal");
    private WikipediaPage laPlata = new WikipediaPage("La Plata");
    private WikipediaPage dockSud = new WikipediaPage("Dock Sud");
    private WikipediaPage argonautas = new WikipediaPage("Los argonautas");
    private WikipediaPage spiderman2 = new WikipediaPage("Spiderman 2");
    private WikipediaPage futbol = new WikipediaPage("Futbol");
    private WikipediaPage reglasFutbol = new WikipediaPage("Reglas del futbol");
    private WikipediaPage ajedrez = new WikipediaPage("Ajedrez");
    private WikipediaPage reglasAjedrez = new WikipediaPage("Reglas del ajedrez");
    private List<IWikipediaPage> wikipedia = new ArrayList<IWikipediaPage>();

    @BeforeEach
    public void setUp() {
        bernal.addLink(laPlata);
        bernal.addLink(dockSud);
        laPlata.addLink(bernal);
        laPlata.addLink(dockSud);
        dockSud.addLink(laPlata);
        dockSud.addLink(bernal);
        argonautas.addLink(spiderman2);
        spiderman2.addLink(argonautas);
        futbol.addInfo("reglas", reglasFutbol);
        ajedrez.addInfo("reglas", reglasAjedrez);
        wikipedia.add(bernal);
        wikipedia.add(laPlata);
        wikipedia.add(dockSud);
        wikipedia.add(spiderman2);
        wikipedia.add(argonautas);
        wikipedia.add(futbol);
        wikipedia.add(ajedrez);
    }

    @Test
    public void mismaLetraInicialEncontrados() {
        MismaLetraInicialFilter filter = new MismaLetraInicialFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(argonautas, wikipedia);
        assertTrue(similarPages.contains(laPlata));
    }

    @Test
    public void mismaLetraInicialNoEncontrados() {
        MismaLetraInicialFilter filter = new MismaLetraInicialFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(futbol, wikipedia);
        System.out.println(similarPages);
        assertTrue(similarPages.isEmpty());
    }

    @Test
    public void linkEnComunEncontrados() {
        LinkEnComunFilter filter = new LinkEnComunFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(bernal, wikipedia);
        assertTrue(similarPages.contains(dockSud));
    }

    @Test
    public void linkEnComunNoEncontrados() {
        LinkEnComunFilter filter = new LinkEnComunFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(spiderman2, wikipedia);
        assertTrue(similarPages.isEmpty());
    }

    @Test
    public void propiedadEnComunEncontrados() {
        PropiedadEnComunFilter filter = new PropiedadEnComunFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(futbol, wikipedia);
        assertTrue(similarPages.contains(ajedrez));
    }

    @Test
    public void propiedadEnComunNoEncontrados() {
        PropiedadEnComunFilter filter = new PropiedadEnComunFilter();
        List<IWikipediaPage> similarPages = filter.getSimilarPages(laPlata, wikipedia);
        assertTrue(similarPages.isEmpty());
    }

}
