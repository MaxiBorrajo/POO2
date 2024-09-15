/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

/**
 *
 * @author maxim
 */
public class Rectangulo {

    Point origen = new Point();
    double altura;
    double ancho;

    public Rectangulo(Point origen, double altura, double ancho) {
        super();
        this.origen = origen;
        this.altura = altura;
        this.ancho = ancho;
    }

    public Rectangulo(double altura, double ancho) {
        super();
        this.altura = altura;
        this.ancho = ancho;
    }

    public double area() {
        return this.altura * this.ancho;
    }

    public double perimetro() {
        return 2 * altura + 2 * ancho;
    }

    public Boolean esHorizontal() {
        return this.ancho > this.altura;
    }
}
