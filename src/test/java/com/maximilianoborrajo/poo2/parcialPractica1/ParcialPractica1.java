/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.parcialPractica1;

import com.maximilianoborrajo.poo2.practicaParcial1.Empresa;
import com.maximilianoborrajo.poo2.practicaParcial1.Material;
import com.maximilianoborrajo.poo2.practicaParcial1.MercadoPago;
import com.maximilianoborrajo.poo2.practicaParcial1.Obra;
import com.maximilianoborrajo.poo2.practicaParcial1.Operario;
import com.maximilianoborrajo.poo2.practicaParcial1.PagoEfectivo;
import com.maximilianoborrajo.poo2.practicaParcial1.Proyecto;
import com.maximilianoborrajo.poo2.practicaParcial1.TarjetaDeCredito;
import com.maximilianoborrajo.poo2.practicaParcial1.Transporte;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class ParcialPractica1 {

    Operario albañil;
    Operario arquitecto;
    Operario flete;
    Material ladrillo;
    Material cemento;
    Material arena;
    Obra obra1;
    Obra obra2;
    Transporte transporte;
    Proyecto proyectoHijo;
    Proyecto proyectoPadre;
    TarjetaDeCredito visa;
    MercadoPago mercadoPago;
    PagoEfectivo pagoEfectivo;
    Empresa apsis;

    @BeforeEach
    public void setUp() {
        albañil = new Operario(100, 8, 6);
        arquitecto = new Operario(1000, 5, 3);
        flete = new Operario(500, 12, 10);
        ladrillo = new Material(100, 1000);
        cemento = new Material(50, 1000);
        arena = new Material(35, 2000);
        obra1 = new Obra(Arrays.asList(ladrillo), Arrays.asList(albañil));
        obra2 = new Obra(Arrays.asList(cemento, arena), Arrays.asList(arquitecto, flete));
        transporte = new Transporte(50, 7000, 10);
        proyectoHijo = new Proyecto(Arrays.asList(obra2, transporte));
        proyectoPadre = new Proyecto(Arrays.asList(obra1, proyectoHijo));
        visa = new TarjetaDeCredito(12);
        mercadoPago = new MercadoPago();
        pagoEfectivo = new PagoEfectivo();
        apsis = new Empresa("Apsis Ingeniería S.A", "30-123456-0", pagoEfectivo, proyectoPadre);
    }

    @Test
    public void costoConPagoEnEfectivo(){
        assertEquals(3732480, apsis.costoDeActividadActual());
    }
    
    @Test
    public void costoConTarjetaDeCredito(){
        apsis.setMetodoDePago(visa);
        assertEquals(3844070.4, apsis.costoDeActividadActual());
    }
    
    @Test
    public void costoConMercadoPago(){
        apsis.setMetodoDePago(mercadoPago);
        assertEquals(3725505.6, apsis.costoDeActividadActual());
    }
}
