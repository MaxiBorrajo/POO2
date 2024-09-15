package com.maximilianoborrajo.poo2.tp2.test;


import com.maximilianoborrajo.poo2.tp2.ejercicio1.Empresa;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.EstadoCivil;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.ReciboDeHaberes;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado.Empleado;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado.EmpleadoPlantaPermanente;
import com.maximilianoborrajo.poo2.tp2.ejercicio1.empleado.EmpleadoTemporario;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

    Empleado empleado1 = new EmpleadoPlantaPermanente("Jorge", "Calle falsa 123", EstadoCivil.Casado,
            LocalDate.of(2002, 05, 12), 1000, 2, 10);
    Empleado empleado2 = new EmpleadoTemporario("Micaela", "Av. Domingo Sarmiento 123", EstadoCivil.Soltero,
            LocalDate.of(1970, 07, 17), 5000, LocalDate.of(1999, 05, 10), 3);
    Empresa empresa = new Empresa("Empresa Falsa SA", "7778888", new ArrayList<>(Arrays.asList(empleado1, empleado2)));

    @Test
    void calculoTotalSueldosNetos() {
        assertAll(() -> assertEquals(1385, this.empleado1.sueldoNeto()),
                () -> assertEquals(4056, this.empleado2.sueldoNeto()),
                () -> assertEquals(5441, this.empresa.totalSueldosNetosAPagar()));
    }

    @Test
    void ejecutarLiquidacionSueldos() {
        this.empresa.ejecutarLiquidacionDeSueldos();
        ReciboDeHaberes reciboEmpleado1 = this.empleado1.getRecibos().getFirst();
        System.out.println("Recibo de haberes del empleado 1:");
        System.out.println(reciboEmpleado1.mostrarDetalles());

        ReciboDeHaberes reciboEmpleado2 = this.empleado2.getRecibos().getFirst();
        System.out.println("Recibo de haberes del empleado 2:");
        System.out.println(reciboEmpleado2.mostrarDetalles());

        assertAll(() -> assertEquals(1, this.empleado1.getRecibos().size()),
                () -> assertEquals(1, this.empleado2.getRecibos().size())
        );
    }
}
