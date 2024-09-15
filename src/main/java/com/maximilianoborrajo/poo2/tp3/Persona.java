/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author maxim
 */
public class Persona {

	String nombre;
	String apellido;
	LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	int edad() {
		Period periodo = Period.between(this.getFechaDeNacimiento(), LocalDate.now());
		
		return periodo.getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public Boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
}