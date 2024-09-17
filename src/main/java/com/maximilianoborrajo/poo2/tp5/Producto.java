/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

/**
 *
 * @author maxim
 */
public class Producto implements Pagable{

    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) throws Exception {
        this.nombre = nombre;
        this.precio = precio;
        
        if(precio <= 0){
            throw new Exception("No se puede agregar un producto sin precio");
        }
        
        if(stock <= 0){
            throw new Exception("No se puede agregar un producto sin stock");
        }
        
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void decrementarStockEnUno() throws Exception {
        if (this.getStock() == 0) {
            throw new Exception("No hay más stock del producto");
        }

        this.setStock(this.getStock() - 1);
    }

    private int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double montoAPagar() {
        return this.getPrecio();
    }
}
