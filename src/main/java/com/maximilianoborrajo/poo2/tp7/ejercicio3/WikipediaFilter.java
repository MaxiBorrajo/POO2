/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
abstract public class WikipediaFilter {

    final List<IWikipediaPage> getSimilarPages(IWikipediaPage page, List<IWikipediaPage> wikipedia) {
        List<IWikipediaPage> similarPages = new ArrayList<IWikipediaPage>();

        for (IWikipediaPage wikiPage : wikipedia) {
            if (!page.equals(wikiPage) && this.isSimilar(page, wikiPage)) {
                similarPages.add(wikiPage);
            }
        }

        return similarPages;
    }

    abstract boolean isSimilar(IWikipediaPage page, IWikipediaPage wikiPage);
}
