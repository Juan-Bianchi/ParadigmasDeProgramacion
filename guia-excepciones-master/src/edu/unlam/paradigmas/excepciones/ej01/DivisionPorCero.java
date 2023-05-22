package edu.unlam.paradigmas.excepciones.ej01;

public class DivisionPorCero {
	
	public static void main(String[] args) {
		int dividendo = 8;
		int divisor = 0;
		
		if(divisor == 0) {
			throw new ArithmeticException();
		}
		
		System.out.println("El resultado es: " + dividendo / divisor);
	}
}
