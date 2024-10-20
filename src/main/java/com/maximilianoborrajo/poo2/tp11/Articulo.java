/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11;

import java.util.List;

/**
 *
 * @author maxim
 */
class Articulo {
    String titulo;
    List<String> autores;
    String filiacion;
    String tipoDeArticulo;
    String lugarPublicacion;
    List<String> palabrasClaves;

    public Articulo(String titulo, List<String> autores, String filiacion, String tipoDeArticulo, String lugarPublicacion, List<String> palabrasClaves) {
        this.titulo = titulo;
        this.autores = autores;
        this.filiacion = filiacion;
        this.tipoDeArticulo = tipoDeArticulo;
        this.lugarPublicacion = lugarPublicacion;
        this.palabrasClaves = palabrasClaves;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getFiliacion() {
        return filiacion;
    }

    public String getTipoDeArticulo() {
        return tipoDeArticulo;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public List<String> getPalabrasClaves() {
        return palabrasClaves;
    }
    
    
}
