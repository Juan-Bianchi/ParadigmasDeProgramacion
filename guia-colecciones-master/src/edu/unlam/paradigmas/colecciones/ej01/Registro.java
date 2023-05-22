package edu.unlam.paradigmas.colecciones.ej01;

import java.util.ArrayList;
import java.util.Collection;

public class Registro {

	private Collection<Paquete> registro = new ArrayList<>();
	
	public void agregarARegistro(Paquete paquete) {
		this.registro.add(paquete);
		paquete.setRegistro(this);
	}
	
	public Collection<Paquete> getRegistro(){
		return this.registro;
	}
	
	public Collection<Paquete> mostrarRegistroDePaquetesDeMasDe(double peso) throws PesoNoValidoException{
		Collection<Paquete> paquetes = new ArrayList<Paquete>();
		
		for (Paquete paquete : registro) {
			if(paquete.pesaMasDe(peso)) {
				paquetes.add(paquete);
			}
		}
		
		return paquetes;
	}
}
