package com.maximilianoborrajo.poo2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

//Esta mal, porque tiene cosas que el servidor pop tiene cosas que no utiliza
//es preferible crear una nueva interfaz mas especifica
public class ServidorPop implements IServidorCorreo {

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}

}
