/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp9;

import com.maximilianoborrajo.poo2.tp9.ejercicio1.Color;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.PokerStatus;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Jugada;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Poker;
import com.maximilianoborrajo.poo2.tp9.ejercicio1.Trio;
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
    
    @BeforeEach
    public void setUp() {
       pokerStatus = new PokerStatus();
       poker = new Poker();
       trio = new Trio();
       color = new Color();
       pokerStatus.addJugada(poker);
       pokerStatus.addJugada(trio);
       pokerStatus.addJugada(color);
    }
    
    @Test
    public void deberiaDeDarPoker(){
        assertEquals("Poker", pokerStatus.verificar("2P", "2C", "2D", "2T", "10D"));
    }
    
    @Test
    public void deberiaDeDarTrio(){
        assertEquals("Trio", pokerStatus.verificar("2P", "2C", "2D", "5T", "10D"));
    }
    
    @Test
    public void deberiaDeDarColor(){
        assertEquals("Color", pokerStatus.verificar("2D", "1D", "KD", "JD", "10D"));
    }
    
    @Test
    public void deberiaDeDarNada(){
        assertEquals("Nada", pokerStatus.verificar("2D", "1P", "KD", "JD", "10D"));
    }
}
