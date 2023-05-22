package edu.unlam.paradigmas.excepciones.ej04;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}

}
