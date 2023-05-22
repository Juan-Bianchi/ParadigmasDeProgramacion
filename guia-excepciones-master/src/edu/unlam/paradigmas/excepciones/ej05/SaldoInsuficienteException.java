package edu.unlam.paradigmas.excepciones.ej05;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}

}
