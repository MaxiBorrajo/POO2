/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio7;

import javax.swing.DefaultListModel;

/**
 *
 * @author maxim
 */
public class ListaDePalabrasOrdenadasAdapter {
    private ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;

    public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaDePalabrasOrdenadas) {
        this.listaDePalabrasOrdenadas = listaDePalabrasOrdenadas;
    }

    // Método para convertir la lista ordenada a un DefaultListModel
    public DefaultListModel<String> getAdaptedListModel() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (int i = 0; i < listaDePalabrasOrdenadas.cantidadDePalabras(); i++) {
            listModel.addElement(listaDePalabrasOrdenadas.getPalabraDePosicion(i));
        }
        return listModel;
    }

    // Método para agregar palabras a la lista ordenada
    public void agregarPalabra(String palabra) {
        listaDePalabrasOrdenadas.agregarPalabra(palabra);
    }
}
