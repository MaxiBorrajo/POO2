/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
public class SolicitudCreditoHipotecario extends SolicitudCredito {

    Inmueble inmueble;

    public SolicitudCreditoHipotecario(int id, Cliente cliente, double monto, int cantMeses, Inmueble inmueble) throws Exception {
        super(id, cliente, monto, cantMeses);
        this.inmueble = inmueble;
    }

    private boolean montoNoSuperiorAPorcentajeInmueble(double porcentaje) {
        return this.getMonto() <= this.getInmueble().getValorFiscal() * (porcentaje / 100);
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    private boolean clienteNoSuperaSesentaYCincoAñosAntesDeFinDeCredito() {
        int añosDelCredito = (int) Math.round(this.getCantMeses() / 12);
        int añosAlFinalCredito = this.getCliente().getEdad() + añosDelCredito;

        return añosAlFinalCredito <= 65;
    }

    @Override
    public boolean condicionSuperarCredito() {
        return montoCuotaNoSuperaPorcentajeSueldoMensual(50) && montoNoSuperiorAPorcentajeInmueble(70)
                && clienteNoSuperaSesentaYCincoAñosAntesDeFinDeCredito();
    }

}
