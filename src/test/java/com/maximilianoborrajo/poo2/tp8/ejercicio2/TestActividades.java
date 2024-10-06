/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp8.ejercicio2;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class TestActividades {

    SecretariaDeportesMunicipio municipio;
    ActividadSemanal futbolALas11;
    ActividadSemanal futbolALas20;
    ActividadSemanal runningALas6;
    ActividadSemanal runningALas18;
    ActividadSemanal basketALas17;
    ActividadSemanal tennisALas14;
    ActividadSemanal jabalinaALas19;

    @BeforeEach
    public void setUp() {
        municipio = new SecretariaDeportesMunicipio();
        futbolALas11 = new ActividadSemanal(DiaSemana.DOMINGO, LocalTime.of(11, 0), 1, Deporte.FUTBOL);
        futbolALas20 = new ActividadSemanal(DiaSemana.LUNES, LocalTime.of(20, 0), 1, Deporte.FUTBOL);
        runningALas6 = new ActividadSemanal(DiaSemana.MARTES, LocalTime.of(6, 0), 1, Deporte.RUNNING);
        runningALas18 = new ActividadSemanal(DiaSemana.JUEVES, LocalTime.of(18, 0), 1, Deporte.RUNNING);
        basketALas17 = new ActividadSemanal(DiaSemana.VIERNES, LocalTime.of(17, 0), 1, Deporte.BASKET);
        tennisALas14 = new ActividadSemanal(DiaSemana.DOMINGO, LocalTime.of(14, 0), 1, Deporte.TENNIS);
        jabalinaALas19 = new ActividadSemanal(DiaSemana.SABADO, LocalTime.of(19, 0), 1, Deporte.JABALINA);
        municipio.addActividad(futbolALas11);
        municipio.addActividad(futbolALas20);
        municipio.addActividad(runningALas6);
        municipio.addActividad(runningALas18);
        municipio.addActividad(basketALas17);
        municipio.addActividad(tennisALas14);
        municipio.addActividad(jabalinaALas19);
        municipio.imprimirTodasLasActividades();
    }

    @Test
    public void todasLasActividadesDeFutbol(){
        assertEquals(Arrays.asList(futbolALas11, futbolALas20), municipio.actividadesDeFutbol());
    }
    
    @Test
    public void todasLasActividadesDeComplejidad(){
        System.out.println(municipio.actividadesDeComplejidad(2));
        assertEquals(Arrays.asList(futbolALas11, futbolALas20, basketALas17), municipio.actividadesDeComplejidad(2));
    }
    
    @Test
    public void todasLasActividadesDeComplejidadInexistente(){
        assertTrue(municipio.actividadesDeComplejidad(0).isEmpty());
    }
    
    @Test
    public void cantidadHorasTotales(){
        assertEquals(7, municipio.cantidadHorasTotales());
    }
    
    @Test
    public void actividadSemanalDeMenorCosto(){
        assertEquals(futbolALas20, municipio.actividadDeMenorCostoSegunDeporte(Deporte.FUTBOL));
    }
    
    @Test
    public void actividadMasEconomicaPorDeporte(){
        Map<Deporte, ActividadSemanal> actividades = municipio.actividadMasEconomicaPorDeporte();
        assertEquals(futbolALas20, actividades.get(Deporte.FUTBOL));
        assertEquals(basketALas17, actividades.get(Deporte.BASKET));
        assertEquals(jabalinaALas19, actividades.get(Deporte.JABALINA));
        assertEquals(runningALas6, actividades.get(Deporte.RUNNING));
        assertEquals(tennisALas14, actividades.get(Deporte.TENNIS));
    }
    
    
}
