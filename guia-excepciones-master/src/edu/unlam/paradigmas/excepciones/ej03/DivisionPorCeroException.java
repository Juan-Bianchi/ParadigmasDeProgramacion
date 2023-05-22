package edu.unlam.paradigmas.excepciones.ej03;

public class DivisionPorCeroException extends RuntimeException{

	public DivisionPorCeroException(String mensaje) {
		super(mensaje);
	}
}
