package edu.unlam.paradigmas.colecciones.ej09;

public class VerifDeBalanceoDeExpresion {
	
	public void verificar() {
		String expresion = "(2+3)+ 6 *(8+9)";
		Pila pila = new Pila();
		
		pila.cargarExpresion(expresion);
		System.out.println("¿La expresión está balanceada? : " + pila.estaBalanceada());
	}

}
