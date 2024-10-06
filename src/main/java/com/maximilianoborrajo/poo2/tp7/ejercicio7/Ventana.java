/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp7.ejercicio7;

import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author maxim
 */
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(DefaultListModel<String> listModel) {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setBounds(new Rectangle(180, 180));
        this.setVisible(true);

        JLabel label = new JLabel("Lista de palabras");
        label.setBounds(new Rectangle(40, 40));
        this.add(label);

        JList<String> lista = new JList<>(listModel);
        lista.setBounds(new Rectangle(110, 160));
        this.add(lista);
    }

    public static void main(String[] args) {
        ListaDePalabrasOrdenadas listaOrdenada = new ListaDePalabrasOrdenadas();
        ListaDePalabrasOrdenadasAdapter adapter = new ListaDePalabrasOrdenadasAdapter(listaOrdenada);

        // Agregar palabras usando el adaptador
        adapter.agregarPalabra("casa");
        adapter.agregarPalabra("arbol");
        adapter.agregarPalabra("perro");
        adapter.agregarPalabra("telefono");
        adapter.agregarPalabra("brazo");

        // Crear la ventana con el modelo adaptado
        new Ventana(adapter.getAdaptedListModel());
    }
}
