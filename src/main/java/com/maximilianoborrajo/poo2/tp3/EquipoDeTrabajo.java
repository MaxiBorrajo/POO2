/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class EquipoDeTrabajo {

	String nombre;
	List<Persona> personas;
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.personas = new ArrayList<Persona>();
	}
	
	public EquipoDeTrabajo(String nombre, List<Persona> personas) {
		super();
		this.nombre = nombre;
		this.personas = personas;
	}

	public String getNombre() {
		return nombre;
	}

	public int promedioEdad() {
		int sumaTotal = 0;
		
		for(Persona persona: this.personas) {
			sumaTotal += persona.edad();
		}
		return sumaTotal / this.personas.size();
	}
	
	public void agregarMiembros(Persona persona) {
		personas.add(persona);
	}
}