/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp2.ejercicio1;

import com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado.Empleado;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Empresa {
	String nombre;
	String cuit;
	List<Empleado> empleados;
	
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	public void ejecutarLiquidacionDeSueldos() {
		for(Empleado empleado : this.empleados) {
			empleado.generarReciboDeHaberes();
		}
	}

	public double totalSueldosNetosAPagar() {
		double sueldosNetos = 0;
		
		for(Empleado empleado : this.empleados) {
			sueldosNetos += empleado.sueldoNeto();
		}
		
		return sueldosNetos;
	}

	public double totalSueldosBrutosAPagar() {
		double sueldosBrutos = 0;
		
		for(Empleado empleado : this.empleados) {
			sueldosBrutos += empleado.sueldoBruto();
		}
		
		return sueldosBrutos;
	}

	public double totalRetencionesARealizar() {
		double retenciones = 0;
		
		for(Empleado empleado : this.empleados) {
			retenciones += empleado.totalRetenciones();
		}
		
		return retenciones;
	}
}
