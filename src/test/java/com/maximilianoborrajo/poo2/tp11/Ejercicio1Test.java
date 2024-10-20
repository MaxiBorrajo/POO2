/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp11;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author maxim
 */
public class Ejercicio1Test {

    Articulo articulo1;
    Articulo articulo2;
    Articulo articulo3;
    Investigador investigador1;
    Investigador investigador2;
    Investigador investigador3;
    SistemaDeArticulos sistema;

    @BeforeEach
    public void setUp() {
        this.sistema = spy(new SistemaDeArticulos());
        this.investigador1 = spy(new Investigador(new PorAutor(), "J.K Rowling"));
        this.investigador2 = spy(new Investigador(new PorTitulo(), "Harry Potter"));
        this.investigador3 = spy(new Investigador(new PorPalabraClave(), "Magia"));
        this.articulo1 = new Articulo("Harry Potter y el prisionero de Azkaban",
                Arrays.asList("J.K Rowling"),
                "Editora",
                "Libro",
                "Alemania",
                Arrays.asList("Magia", "Hechizos"));
        this.articulo2 = new Articulo("Narnia",
                Arrays.asList("C.S Lewis"),
                "Editora",
                "Libro",
                "Alemania",
                Arrays.asList("Magia", "Leon"));
        this.articulo3 = new Articulo("Animales fantasticos",
                Arrays.asList("J.K Rowling"),
                "Editora",
                "Libro",
                "Alemania",
                Arrays.asList("Magia", "Hechizos"));
        this.sistema.añadirSubscriptor(investigador1);
        this.sistema.añadirSubscriptor(investigador2);
        this.sistema.añadirSubscriptor(investigador3);
    }

    @Test
    public void testNotificacionEnviada() {
        this.sistema.añadirArticulo(articulo1);
        this.sistema.añadirArticulo(articulo2);
        this.sistema.añadirArticulo(articulo3);
        verify(investigador1, times(2)).recibirNotificacion(any(Articulo.class));
        verify(investigador2, times(1)).recibirNotificacion(any(Articulo.class));
        verify(investigador3, times(3)).recibirNotificacion(any(Articulo.class));
    }
}
