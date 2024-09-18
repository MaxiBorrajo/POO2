/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Banco implements Gestionable {

    List<Cliente> clientes = new ArrayList<Cliente>();
    List<SolicitudCredito> solicitudesDeCredito = new ArrayList<SolicitudCredito>();
    SistemaInformaticoBanco sistemaInformatico;

    public Banco(SistemaInformaticoBanco sistemaInformatico) {
        this.sistemaInformatico = sistemaInformatico;
    }

    @Override
    public void añadirCliente(Cliente cliente) {
        this.getSistemaInformatico().añadirCliente(cliente, this);
    }

    @Override
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<SolicitudCredito> getSolicitudesDeCredito() {
        return solicitudesDeCredito;
    }

    private double montoTotalCreditos() {
        return this.getSistemaInformatico().montoTotalCreditos(this);
    }

    public SistemaInformaticoBanco getSistemaInformatico() {
        return sistemaInformatico;
    }

    private void registrarSolicitudCredito(SolicitudCredito solicitudCredito) {
        this.getSistemaInformatico().registrarSolicitudCredito(solicitudCredito, this);
    }

    private void eliminarSolicitudCredito(SolicitudCredito solicitudCredito) {
        this.getSolicitudesDeCredito().remove(solicitudCredito);
    }

    private int getId() {
        if (this.getSolicitudesDeCredito().isEmpty()) {
            return 1;
        }

        SolicitudCredito credito = this.getSolicitudesDeCredito().getLast();

        return credito.getId() + 1;
    }

    public void solicitarCredito(Cliente cliente, SolicitudCredito credito) {
        this.registrarSolicitudCredito(credito);
    }

    public void evaluarCredito(SolicitudCredito solicitudCredito) throws Exception {
        if (!this.getSolicitudesDeCredito().contains(solicitudCredito)) {
            throw new Exception("La solicitud a evaluar no está registrada");
        }

        if (solicitudCredito.condicionSuperarCredito()) {
            Cliente cliente = solicitudCredito.getCliente();
            cliente.recibirDinero(solicitudCredito.getMonto());
        }

        eliminarSolicitudCredito(solicitudCredito);
    }
}
