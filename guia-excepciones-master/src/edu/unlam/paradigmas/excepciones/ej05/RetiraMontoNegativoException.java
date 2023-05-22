package edu.unlam.paradigmas.excepciones.ej05;

public class RetiraMontoNegativoException extends RuntimeException{
	
	public RetiraMontoNegativoException(String mensaje) {
		super(mensaje);
	}
}
