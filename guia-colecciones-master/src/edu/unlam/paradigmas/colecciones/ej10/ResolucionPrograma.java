package edu.unlam.paradigmas.colecciones.ej10;

public class ResolucionPrograma {

	public void resolver() {
		String[] programa = {"Abrir paquete", "quitar producto", "armar producto", "probar producto", "terminar instalacion"};
		Terminal terminal = new Terminal();
			
		/*terminal.cargarPrograma(programa);
		terminal.quitarComando();
		terminal.ejecutarPrograma();*/
		
		terminal.cargarPrograma(programa);
		terminal.ejecutarPrograma();
	}
}
