package edu.unlam.paradigmas.colecciones.ej06;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

	private String nombre;
	private int dni;
	private List<Integer> notas = new ArrayList<>();
	
	
	public Estudiante(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public int getDni() {
		return dni;
	}


	public List<Integer> getNotas() {
		return notas;
	}
	
	public void agregarNota(int nota) {
		if(nota < 1 || nota > 10) {
			throw new NotaFueraDeRangoException("La nota debe ser un número entre 1 y 10");
		}
		notas.add(nota);
	}
	

}
