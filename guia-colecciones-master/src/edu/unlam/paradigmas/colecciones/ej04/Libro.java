package edu.unlam.paradigmas.colecciones.ej04;

public class Libro {

	private String nombre;

	public Libro(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
