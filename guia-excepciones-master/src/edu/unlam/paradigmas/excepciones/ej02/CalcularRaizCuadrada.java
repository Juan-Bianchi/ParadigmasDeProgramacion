package edu.unlam.paradigmas.excepciones.ej02;

public class CalcularRaizCuadrada {
	
	public static void main(String[] args) throws RaizCuadradaNegativaException{
		double numero = -2;
		double raiz = 0;
		
		if(numero < 0) {
			throw new RaizCuadradaNegativaException("No puede calcularse la raiz cuadrada de un número negativo.");
		}
		
		raiz = Math.sqrt(numero);
	}
}
