/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.test;

import com.maximilianoborrajo.poo2.tp6.caso2.Cliente;
import com.maximilianoborrajo.poo2.tp6.caso2.Banco;
import com.maximilianoborrajo.poo2.tp6.caso2.SistemaInformaticoBanco;
import com.maximilianoborrajo.poo2.tp6.caso2.SolicitudCreditoHipotecario;
import com.maximilianoborrajo.poo2.tp6.caso2.SolicitudCreditoPersonal;
import com.maximilianoborrajo.poo2.tp6.caso2.Inmueble;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
public class BancoTest {
    
    private Cliente cliente;
    private Banco banco;
    private SistemaInformaticoBanco sistemaInformatico;
    private SolicitudCreditoHipotecario creditoHipotecario;
    private SolicitudCreditoPersonal creditoPersonal;
    private Inmueble inmueble;

    //Preguntar como incluir el registrarPago de la agencia
    @BeforeEach
    public void setUp() throws Exception {
    }
    
    @Test
    public void agregarCliente() {
    }
    
    @Test
    public void clienteSolicitaCreditoPersonalYEsRechazado() {
    }
    
    @Test
    public void clienteSolicitaCreditoPersonalYEsAceptado() {
    }
    
    @Test
    public void clienteSolicitaCreditoHipotecarioYEsRechazado() {
    }
    
    @Test
    public void clienteSolicitaCreditoHipotecarioYEsAceptado() {
    }
}
