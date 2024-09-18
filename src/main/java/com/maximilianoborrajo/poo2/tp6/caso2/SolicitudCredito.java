/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso2;

/**
 *
 * @author maxim
 */
public abstract class SolicitudCredito {

    int id;
    Cliente cliente;
    double monto;
    int cantMeses;

    public SolicitudCredito(int id, Cliente cliente, double monto, int cantMeses) throws Exception {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        
        if(cantMeses <= 0){
            throw new Exception("La cantidad de meses no puede ser menor igual a cero");
        }
        
        this.cantMeses = cantMeses;
    }
    
    protected boolean montoCuotaNoSuperaPorcentajeSueldoMensual(double porcentaje) {
        return this.getCuotaMensual() <= this.getCliente().getSueldoNeto() * (porcentaje / 100);
    }
    
    public abstract boolean condicionSuperarCredito();
    
    public double getCuotaMensual(){
        return this.getMonto() / this.getCantMeses();
    }

    public double getMonto() {
        return monto;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    protected double getCantMeses() {
        return this.cantMeses;
    }
}
