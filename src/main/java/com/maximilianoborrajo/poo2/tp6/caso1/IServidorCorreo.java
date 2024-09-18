/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maximilianoborrajo.poo2.tp6.caso1;

import java.util.List;

/**
 *
 * @author maxim
 */
public interface IServidorCorreo {

    public List<Correo> recibirNuevos(String user, String pass);

    public void conectar(String nombreUsuario, String passusuario);

    public void enviar(Correo correo);
}
