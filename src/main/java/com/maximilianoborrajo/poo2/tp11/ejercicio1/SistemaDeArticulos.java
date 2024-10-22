/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class SistemaDeArticulos {

    List<Articulo> articulos;
    List<Investigador> subscriptores;

    public SistemaDeArticulos() {
        this.articulos = new ArrayList();
        this.subscriptores = new ArrayList();
    }

    public void añadirArticulo(Articulo articulo) {
        this.articulos.add(articulo);
        this.enviarNotificaciones(articulo);
    }

    public void añadirSubscriptor(Investigador investigador) {
        this.subscriptores.add(investigador);
    }

    void enviarNotificaciones(Articulo articulo) {
        List<Investigador> cumplenConCriterio = this.subscriptores.stream().filter(s -> {
            return s.cumpleConCriterioDeSubscripcion(articulo);
        }).toList();

        for (Investigador investigador : cumplenConCriterio) {
            investigador.recibirNotificacion(articulo);
        }
    }

}
