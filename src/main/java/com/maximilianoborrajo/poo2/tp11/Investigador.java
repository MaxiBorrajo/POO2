/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11;

/**
 *
 * @author maxim
 */
class Investigador {

    CriterioSubscription criterioSubscription;
    String valorDeCriterio;

    public Investigador(CriterioSubscription criterioSubscription, String valorDeCriterio) {
        this.criterioSubscription = criterioSubscription;
        this.valorDeCriterio = valorDeCriterio;
    }

    public boolean cumpleConCriterioDeSubscripcion(Articulo articulo) {
        return this.criterioSubscription.cumple(articulo, this.valorDeCriterio);
    }

    public void recibirNotificacion(Articulo articulo) {
        System.out.println("La clase Articulo tiene los siguientes valores:\n"
                + "Titulo: " + articulo.getTitulo() + "\n"
                + "Autores: " + articulo.getAutores() + "\n"
                + "Filiacion: " + articulo.getFiliacion() + "\n"
                + "Tipo de Articulo: " + articulo.getTipoDeArticulo() + "\n"
                + "Lugar de Publicacion: " + articulo.getLugarPublicacion() + "\n"
                + "Palabras Claves: " + articulo.getPalabrasClaves() + "\n");
    }

    private boolean criterioSubscription(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
