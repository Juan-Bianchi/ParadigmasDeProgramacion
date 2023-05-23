package edu.unlam.paradigmas.colecciones.ej09;

import java.util.Stack;

public class Pila {

	private Stack<Character> expresion = new Stack<>();
	
	public void cargarExpresion(String expresion) {
		for (char character : expresion.toCharArray()) {
			if(character == '(' || character == ')') {
				this.expresion.push(character);
			}
		}
	}
	
	public boolean estaBalanceada() {
		Stack<Character> pilaCopiada = (Stack<Character>) this.expresion.clone();
		int balance = 0;
		
		for(int i=0; i<this.expresion.size() && balance >= 0; i++) {
			char caracter = pilaCopiada.pop();
			
			if(caracter == ')') {
				balance ++;
			}
			else {
				balance --;
			}
		}
		
		return balance == 0;
	}
}
