package edu.unlam.paradigmas.excepciones.ej05;

public class DepositaMontoNegativoException extends RuntimeException{
	
	public DepositaMontoNegativoException(String mensaje) {
		super(mensaje);
	}
}
