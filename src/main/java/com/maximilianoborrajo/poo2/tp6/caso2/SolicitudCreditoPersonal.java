/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
public class SolicitudCreditoPersonal extends SolicitudCredito {

    public SolicitudCreditoPersonal(int id, Cliente cliente, double monto, int cantMeses) throws Exception {
        super(id, cliente, monto, cantMeses);
    }

    private boolean superaLosQuinceMilAnuales() {
        return this.getCliente().getSueldoAnual() >= 15000;
    }

    @Override
    public boolean condicionSuperarCredito() {
        return superaLosQuinceMilAnuales() && montoCuotaNoSuperaPorcentajeSueldoMensual(70);
    }

}
