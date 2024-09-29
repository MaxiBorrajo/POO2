/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio3;

import java.util.List;
import java.util.Map;

/**
 *
 * @author maxim
 */
public interface IWikipediaPage {

    String getTitle();

    /*retorna el título de la página.*/

    List<IWikipediaPage> getLinks();

    /*retorna una Lista de las páginas de
Wikipedia con las que se conecta.*/

    Map<String, IWikipediaPage> getInfobox();
    /*retorna un Map con un valor en
texto y la pagina que describe ese valor que aparecen en los infobox de la
página de Wikipedia.*/
}
