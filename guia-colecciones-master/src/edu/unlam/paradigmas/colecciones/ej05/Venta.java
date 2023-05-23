package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;

public class Venta {
	
	private String codigo;
	private double valor;
	private LocalDate fecha;
	
	
	public Venta( String codigo, double valor, LocalDate fecha) {
		this.codigo = codigo;
		this.valor = valor;
		this.fecha = fecha;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}
