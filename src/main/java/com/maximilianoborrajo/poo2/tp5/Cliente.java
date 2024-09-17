/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Cliente {

    List<Pagable> pagables = new ArrayList<Pagable>();

    public List<Pagable> getPagables() {
        return pagables;
    }

    public void añadirPagable(Pagable pagable) {
        pagables.add(pagable);
    }

    public double registrarProductos(Caja caja) {
        double montoAPagar = caja.cobrar(this.getPagables());
        return montoAPagar;
    }
}
