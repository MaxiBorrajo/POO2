/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9;

import com.maximilianoborrajo.poo2.tp9.ejercicio1.Carta;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Color;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.PokerStatus;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Jugada;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Palo;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Poker;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Trio;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Valor;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class TestPoker {

    PokerStatus pokerStatus;
    Jugada poker;
    Jugada trio;
    Jugada color;
    List<Carta> cartasPoker;
    List<Carta> cartasColor;
    List<Carta> cartasTrio;
    List<Carta> cartasSinJugada;

    @BeforeEach
    public void setUp() {
        pokerStatus = new PokerStatus();
        poker = new Poker();
        trio = new Trio();
        color = new Color();
        pokerStatus.addJugada(poker);
        pokerStatus.addJugada(trio);
        pokerStatus.addJugada(color);
        cartasPoker = Arrays.asList(
                new Carta(Valor.DOS, Palo.PICAS),
                new Carta(Valor.DOS, Palo.CORAZON),
                new Carta(Valor.DOS, Palo.DIAMANTES),
                new Carta(Valor.DOS, Palo.TREBOLES),
                new Carta(Valor.DIEZ, Palo.DIAMANTES)
        );
        cartasTrio = Arrays.asList(
                new Carta(Valor.DOS, Palo.PICAS),
                new Carta(Valor.DOS, Palo.CORAZON),
                new Carta(Valor.DOS, Palo.DIAMANTES),
                new Carta(Valor.CINCO, Palo.TREBOLES),
                new Carta(Valor.DIEZ, Palo.DIAMANTES)
        );
        cartasColor = Arrays.asList(
                new Carta(Valor.DOS, Palo.DIAMANTES),
                new Carta(Valor.A, Palo.DIAMANTES),
                new Carta(Valor.K, Palo.DIAMANTES),
                new Carta(Valor.J, Palo.DIAMANTES),
                new Carta(Valor.DIEZ, Palo.DIAMANTES)
        );
        cartasSinJugada = Arrays.asList(
                new Carta(Valor.DOS, Palo.DIAMANTES),
                new Carta(Valor.A, Palo.PICAS),
                new Carta(Valor.K, Palo.DIAMANTES),
                new Carta(Valor.J, Palo.DIAMANTES),
                new Carta(Valor.DIEZ, Palo.DIAMANTES)
        );
    }

    @Test
    public void deberiaDeDarPoker() {
        assertEquals(poker, pokerStatus.verificar(cartasPoker));
    }

    @Test
    public void deberiaDeDarTrio() {
        assertEquals(trio, pokerStatus.verificar(cartasTrio));
    }

    @Test
    public void deberiaDeDarColor() {
        assertEquals(color, pokerStatus.verificar(cartasColor));
    }

    @Test
    public void deberiaDeDarNada() {
        assertNull(pokerStatus.verificar(cartasSinJugada));
    }

    @Test
    public void deberiaDeDarJugadaGanadoraPoker() {
        assertEquals(poker, pokerStatus.jugadaGanadora(cartasPoker, cartasColor));
        assertEquals(poker, pokerStatus.jugadaGanadora(cartasPoker, cartasTrio));
    }

    @Test
    public void deberiaDeDarJugadaGanadoraColor() {
        assertEquals(color, pokerStatus.jugadaGanadora(cartasColor, cartasTrio));
    }

    @Test
    public void deberiaDeDarJugadaGanadoraTrio() {
        assertEquals(trio, pokerStatus.jugadaGanadora(cartasTrio, cartasSinJugada));
    }

    @Test
    public void deberiaDeDarEmpate() {
        List<Carta> cartas = Arrays.asList(
                new Carta(Valor.TRES, Palo.PICAS),
                new Carta(Valor.TRES, Palo.CORAZON),
                new Carta(Valor.TRES, Palo.DIAMANTES),
                new Carta(Valor.TRES, Palo.TREBOLES),
                new Carta(Valor.DIEZ, Palo.DIAMANTES)
        );
        Jugada pokerVerificado = pokerStatus.verificar(cartas);
        assertSame(pokerVerificado, pokerStatus.jugadaGanadora(cartasPoker, cartas));
    }
}
