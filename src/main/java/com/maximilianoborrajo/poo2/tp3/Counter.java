/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp3;

import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class Counter {

    private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

    public void addNumber(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public int contarCantidadPares() {
        int cantPares = 0;

        for (int numero : listaDeNumeros) {
            cantPares += this.unoSiEsVerdadCeroSiNo(this.esMultiploDe(numero, 2));
        }

        return cantPares;
    }

    public int contarCantidadImpares() {
        int cantImpares = 0;

        for (int numero : listaDeNumeros) {
            cantImpares += this.unoSiEsVerdadCeroSiNo(!this.esMultiploDe(numero, 2));
        }

        return cantImpares;
    }

    private int unoSiEsVerdadCeroSiNo(Boolean condicion) {
        return condicion ? 1 : 0;
    }

    private Boolean esMultiploDe(int numero, int multiplo) {
        return numero % multiplo == 0;
    }

    public int retornaNumeroMayorCantidadPares(ArrayList<Integer> lista) {
        int elDeMayorCantidadDePares = lista.getFirst();

        for (int numero : lista) {
            elDeMayorCantidadDePares = this.elDeMayorCantidadDeDigitosParesEntre(elDeMayorCantidadDePares, numero);
        }

        return elDeMayorCantidadDePares;
    }

    private int elDeMayorCantidadDeDigitosParesEntre(int primerNumero, int segundoNumero) {
        return this.cantidadDigitosPares(primerNumero) > this.cantidadDigitosPares(segundoNumero) ? primerNumero : segundoNumero;
    }

    private int cantidadDigitosPares(int numero) {
        int cantidadPares = 0;
        int numeroActual = numero;

        while ((numeroActual / 10) != 0) {
            cantidadPares += this.unoSiEsVerdadCeroSiNo(this.esMultiploDe(numeroActual % 10, 2));
            numeroActual = numeroActual / 10;
        }

        cantidadPares += this.unoSiEsVerdadCeroSiNo(this.esMultiploDe(numeroActual % 10, 2));

        return cantidadPares;
    }

    public int numeroMasGrandeEntreCeroYMilMultiploDe(int primerNumero, int segundoNumero) {
        int firstNumber = 1000;

        while (!(this.esMultiploDe(firstNumber, primerNumero) || this.esMultiploDe(firstNumber, primerNumero)) && firstNumber != 0) {
            firstNumber -= 1;
        }

        return firstNumber == 0 ? -1 : firstNumber;
    }
}
