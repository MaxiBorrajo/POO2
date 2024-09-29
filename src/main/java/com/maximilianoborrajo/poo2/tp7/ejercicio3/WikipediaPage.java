/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author maxim
 */
public class WikipediaPage implements IWikipediaPage {
    private String title;
    private List<IWikipediaPage> links = new ArrayList<IWikipediaPage>();
    private Map<String, IWikipediaPage> infobox = new HashMap<String, IWikipediaPage>();

    public WikipediaPage(String title) {
        this.title = title;
    }
    
    public void addLink(IWikipediaPage page){
        this.getLinks().add(page);
    }
    
    public void addInfo(String key, IWikipediaPage page){
        this.getInfobox().put(key, page);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public List<IWikipediaPage> getLinks() {
        return this.links;
    }

    @Override
    public Map<String, IWikipediaPage> getInfobox() {
        return this.infobox;
    }
    
}
