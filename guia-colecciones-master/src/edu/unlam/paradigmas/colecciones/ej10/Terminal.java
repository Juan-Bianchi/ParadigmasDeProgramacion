package edu.unlam.paradigmas.colecciones.ej10;

import java.util.Stack;

public class Terminal {
	
	private Stack<String> pilaInstrucciones = new Stack<>();
	
	public void cargarPrograma(String[] programa) {
		for(int i=0; i<programa.length; i++) {
			pilaInstrucciones.add(programa[i]);
		}
	}
	
	public void agregarComando(String comando) {
		pilaInstrucciones.add(comando);
	}
	
	public void quitarComando() {
		pilaInstrucciones.pop();
	}
	
	public void ejecutarPrograma() {
		int tam = pilaInstrucciones.size();
		Stack<String> pilaAux = new Stack<>();
		for(int i= 0; i < tam; i++) {
			pilaAux.add(pilaInstrucciones.pop().toString()); ;
		}
		for(int i= 0; i < tam; i++) {
			System.out.println(pilaAux.pop().toString());
		}
	}

}
