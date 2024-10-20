/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp10;

import com.maximilianoborrajo.poo2.tp10.ejercicio1.CambiarPorVocalSiguiente;
import com.maximilianoborrajo.poo2.tp10.ejercicio1.EncriptacionBase;
import com.maximilianoborrajo.poo2.tp10.ejercicio1.EncriptadorNaive;
import com.maximilianoborrajo.poo2.tp10.ejercicio1.LetrasPorNumeros;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class EncriptadorTest {

    CambiarPorVocalSiguiente encriptadorVocalSiguiente;
    LetrasPorNumeros encriptadorLetraPorNumero;
    EncriptadorNaive encriptador;

    @BeforeEach
    public void setUp() {
        this.encriptadorVocalSiguiente = new CambiarPorVocalSiguiente();
        this.encriptadorLetraPorNumero = new LetrasPorNumeros();
        this.encriptador = new EncriptadorNaive();
    }

    @Test
    public void encriptadorBase(){
        String texto = "Hola Mundo";
        String textoEncriptado = this.encriptador.encriptar(texto);
        assertEquals("Mundo Hola", textoEncriptado);
        assertEquals(texto, this.encriptador.desencriptar(textoEncriptado));
    }
    
    @Test
    public void encriptadorCambiaVocal(){
        String texto = "Hola Mundo";
        this.encriptador.setEncriptacion(encriptadorVocalSiguiente);
        String textoEncriptado = this.encriptador.encriptar(texto);
        assertEquals("Hule Mandu", textoEncriptado);
        assertEquals(texto, this.encriptador.desencriptar(textoEncriptado));
    }
    
    @Test
    public void encriptadorLetraPorNumeros(){
        String texto = "Hola Mundo";
        this.encriptador.setEncriptacion(encriptadorLetraPorNumero);
        String textoEncriptado = this.encriptador.encriptar(texto);
        assertEquals("8,16,12,1,0,13,22,14,4,16", textoEncriptado);
        assertEquals(texto.toLowerCase(), this.encriptador.desencriptar(textoEncriptado));
    }
}
