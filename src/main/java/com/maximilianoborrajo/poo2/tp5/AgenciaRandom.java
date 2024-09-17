/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp5;

/**
 *
 * @author maxim
 */
public class AgenciaRandom implements Agencia{

    @Override
    public void registrarPago(Factura factura) {
        System.out.println("Se ha registrado un pago de $" + factura.montoAPagar());
    }
    
}
