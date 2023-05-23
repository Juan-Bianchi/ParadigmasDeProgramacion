package edu.unlam.paradigmas.colecciones.ej07;

public class Tarea {

	private String codigo;
	private String descripcion;
	
	
	public Tarea(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Tarea [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
}
