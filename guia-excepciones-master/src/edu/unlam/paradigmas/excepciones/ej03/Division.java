package edu.unlam.paradigmas.excepciones.ej03;

public class Division {

	public static void main(String[] args) {
		int dividendo = 8;
		int divisor = 0;
		
		if(divisor == 0) {
			throw new DivisionPorCeroException("No puede dividirse por cero");
		}
		
		System.out.println("El resultado es: " + dividendo / divisor);
	}
}
