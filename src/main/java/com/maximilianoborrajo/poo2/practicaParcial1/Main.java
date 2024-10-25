/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.maximilianoborrajo.poo2.practicaParcial1;

import java.util.Arrays;

/**
 *
 * @author maxim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operario albañil = new Operario(100, 8, 6);
        Operario arquitecto = new Operario(1000, 5, 3);
        Operario flete = new Operario(500, 12, 10);
        Material ladrillo = new Material(100, 1000);
        Material cemento = new Material(50, 1000);
        Material arena = new Material(35, 2000);
        Obra obra1 = new Obra(Arrays.asList(ladrillo),Arrays.asList(albañil));
        Obra obra2 = new Obra(Arrays.asList(cemento, arena),Arrays.asList(arquitecto, flete));
        Transporte transporte = new Transporte(50, 7000, 10);
        Proyecto proyectoHijo = new Proyecto(Arrays.asList(obra2, transporte));
        Proyecto proyectoPadre = new Proyecto(Arrays.asList(obra1, proyectoHijo));
        TarjetaDeCredito visa = new TarjetaDeCredito(12);
        Empresa apsis = new Empresa("Apsis Ingeniería S.A", "30-123456-0", visa, proyectoPadre);
    }
    
}
