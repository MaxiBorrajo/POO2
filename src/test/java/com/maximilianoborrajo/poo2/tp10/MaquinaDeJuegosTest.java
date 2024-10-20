package com.maximilianoborrajo.poo2.tp10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.maximilianoborrajo.poo2.tp10.ejercicio2.ApagadoState;
import com.maximilianoborrajo.poo2.tp10.ejercicio2.GameInProcessState;
import com.maximilianoborrajo.poo2.tp10.ejercicio2.MaquinaDeVideoJuegos;
import com.maximilianoborrajo.poo2.tp10.ejercicio2.OnePlayerState;
import com.maximilianoborrajo.poo2.tp10.ejercicio2.TwoPlayerState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxim
 */
public class MaquinaDeJuegosTest {

    MaquinaDeVideoJuegos maquina;

    @BeforeEach
    public void setUp() {
        this.maquina = new MaquinaDeVideoJuegos();
    }

    @Test
    public void probandoParaUnJugador() {
        assertInstanceOf(ApagadoState.class, maquina.getEstado());
        maquina.pressStartButton();
        maquina.insertCoin();
        assertInstanceOf(OnePlayerState.class, maquina.getEstado());
        maquina.pressStartButton();
        assertInstanceOf(GameInProcessState.class, maquina.getEstado());
    }

    @Test
    public void probandoParaDosJugadores() {
        assertInstanceOf(ApagadoState.class, maquina.getEstado());
        maquina.pressStartButton();
        maquina.insertCoin();
        assertInstanceOf(OnePlayerState.class, maquina.getEstado());
        maquina.insertCoin();
        assertInstanceOf(TwoPlayerState.class, maquina.getEstado());
        maquina.pressStartButton();
        assertInstanceOf(GameInProcessState.class, maquina.getEstado());
    }
}
