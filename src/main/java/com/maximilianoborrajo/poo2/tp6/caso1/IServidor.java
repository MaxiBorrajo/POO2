package com.maximilianoborrajo.poo2.tp6.caso1;

import java.util.List;


public interface IServidor extends IServidorCorreo {
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();

}
