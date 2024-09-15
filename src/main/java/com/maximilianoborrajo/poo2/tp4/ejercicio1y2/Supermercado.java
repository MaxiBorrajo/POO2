/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp4.ejercicio1y2;

import com.maximilianoborrajo.poo2.tp4.ejercicio1y2.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Supermercado {

    List<Producto> productos = new ArrayList<Producto>();
    String nombre;
    String direccion;

    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Double getPrecioTotal(){
        double total = 0;
        
        for(Producto producto: this.productos ){
            total += producto.getPrecio();
        }
        
        return total;
    }

    public Integer getCantidadDeProductos() {

        return this.productos.size();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

}
