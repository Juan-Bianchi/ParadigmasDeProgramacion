package edu.unlam.paradigmas.excepciones.ej08;


public class PruebaAssert {
    public static void main(String[] args) {
    	int dividendo = 10;
    	int divisor = 0;

    	assert divisor != 0 : "El divisor no puede ser cero";

    	int resultado = dividendo / divisor;
    	System.out.println("Resultado: " + resultado);
    }
}
