package edu.unlam.paradigmas.colecciones.ej02;

import java.time.LocalDate;

public interface Registro {

	public void agregarElementoAlRegistro(Object elemento);
	
	public Object buscarElementoEnRegistro(int codigo);
	
	public void mostrarElementosPorFecha(LocalDate fecha);
}
