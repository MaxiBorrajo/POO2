/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3.test;

import com.maximilianoborrajo.poo2.tp3.EquipoDeTrabajo;
import com.maximilianoborrajo.poo2.tp3.Persona;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author maxim
 */
class EquipoTrabajoTestCase {

    EquipoDeTrabajo equipoTrabajo;
    Persona persona1;
    Persona persona2;

    @BeforeEach
    void setUp() throws Exception {
        persona1 = new Persona("Jorge", "Gonzalez", LocalDate.of(2002, 5, 12));
        persona2 = new Persona("Jorgelina", "Fernandez", LocalDate.of(1970, 10, 21));
        equipoTrabajo = new EquipoDeTrabajo("Equipo");
        equipoTrabajo.agregarMiembros(persona1);
        equipoTrabajo.agregarMiembros(persona2);
    }

    @Test
    void test() {
        assertEquals(37, equipoTrabajo.promedioEdad());
    }

}
