/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5.test;

import com.maximilianoborrajo.poo2.tp5.Agencia;
import com.maximilianoborrajo.poo2.tp5.AgenciaRandom;
import com.maximilianoborrajo.poo2.tp5.Caja;
import com.maximilianoborrajo.poo2.tp5.Cliente;
import com.maximilianoborrajo.poo2.tp5.Factura;
import com.maximilianoborrajo.poo2.tp5.Producto;
import com.maximilianoborrajo.poo2.tp5.ProductoCooperativa;
import com.maximilianoborrajo.poo2.tp5.Servicio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class CajaTest {
    
    private Cliente cliente;
    private Producto leche;
    private ProductoCooperativa yerba;
    private Caja caja;
    private Agencia agenciaRandom;
    private Servicio servicio;

    //Preguntar como incluir el registrarPago de la agencia
    @BeforeEach
    public void setUp() throws Exception {
        cliente = new Cliente();
        leche = new Producto("Leche", 100, 10);
        yerba = new ProductoCooperativa("Yerba", 100, 10);
        caja = new Caja(agenciaRandom);
        agenciaRandom = new AgenciaRandom();
        servicio = new Servicio(1000, 500, 10);
    }
    
    @Test
    public void testTirarErrorAlCrearProductoSinStock() {
         Exception exception = assertThrows(Exception.class, () -> {
            new Producto("Algo", 10, 0);
        });

        // Verificamos el mensaje de la excepción
        assertEquals("No se puede agregar un producto sin stock", exception.getMessage());
    }
    
    @Test
    public void testTirarErrorAlCrearProductoSinPrecio() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Producto("Algo", 0, 10);
        });

        // Verificamos el mensaje de la excepción
        assertEquals("No se puede agregar un producto sin precio", exception.getMessage());
    }
    
    @Test
    public void testRegistrarPagables() {
        Factura factura = new Factura();
        factura.añadirServicio(servicio);
        cliente.añadirPagable(leche);
        cliente.añadirPagable(yerba);
        cliente.añadirPagable(factura);
        
        double montoTotal = cliente.registrarProductos(caja);
        
        assertEquals(10690, montoTotal);
    }
}
