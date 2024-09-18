/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
public class SistemaInformaticoBanco {

    public void añadirCliente(Cliente cliente, Banco banco) {
        banco.añadirCliente(cliente);
    }

    public void registrarSolicitudCredito(SolicitudCredito solicitudCredito, Banco banco) {

        Cliente clienteDelCredito = solicitudCredito.getCliente();

        if (!banco.getClientes().contains(clienteDelCredito)) {
            banco.añadirCliente(clienteDelCredito);
        }

        banco.getSolicitudesDeCredito().add(solicitudCredito);
    }

    private double montoSiAceptableCeroSiNo(SolicitudCredito credito) {
        return credito.condicionSuperarCredito() ? credito.getMonto() : 0;
    }

    public double montoTotalCreditos(Banco banco) {
        double total = 0;

        for (SolicitudCredito credito : banco.getSolicitudesDeCredito()) {
            total += this.montoSiAceptableCeroSiNo(credito);
        }

        return total;
    }
}
