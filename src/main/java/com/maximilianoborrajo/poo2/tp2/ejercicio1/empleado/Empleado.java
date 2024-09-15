/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado;

import com.maximilianoborrajo.poo2.tp2.ejercicio1.EstadoCivil;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.ReciboDeHaberes;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public abstract class Empleado {
	public Empleado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	String nombre;
	String direccion;
	EstadoCivil estadoCivil;
	LocalDate fechaNacimiento;
	protected double sueldoBasico;
	List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	

	int edad() {
		Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
		return periodo.getYears();
	}

	public List<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public abstract double sueldoBruto();

	public double totalRetenciones() {
		return this.retencionAporteJubilatorio() + this.retencionObraSocial();
	}
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.totalRetenciones();
	};
	
	protected abstract double retencionObraSocial();

	protected abstract double retencionAporteJubilatorio();

	public ReciboDeHaberes generarReciboDeHaberes() {
		ReciboDeHaberes recibo = new ReciboDeHaberes(this.nombre, this.direccion, this.sueldoBruto(), this.sueldoNeto(), this.generarDesgloseDeConceptos());
		this.recibos.add(recibo);
		return recibo;
	}

	protected abstract String generarDesgloseDeConceptos();
}
