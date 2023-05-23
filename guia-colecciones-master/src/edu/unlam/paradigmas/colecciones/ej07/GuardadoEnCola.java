package edu.unlam.paradigmas.colecciones.ej07;

public class GuardadoEnCola {
	
	Cola cola = new Cola();
	
	public void guardarEnCola(){
		Tarea tarea1 = new Tarea("001", "Limpiar piso");
		Tarea tarea2 = new Tarea("002", "Cortar pasto");
		Tarea tarea3 = new Tarea("003", "Barrer patio");
		Tarea tarea4 = new Tarea("004", "Cocinar");
		Tarea tarea5 = new Tarea("005", "Manejar automovil");
		Tarea tarea6 = new Tarea("006", "Montar bicicleta");
		Tarea tarea7 = new Tarea("007", "Ver TV");
		Tarea tarea8 = new Tarea("008", "Mirar Netflix");
		Tarea tarea9 = new Tarea("009", "Trabajar");
		
		cola.add(tarea1);
		cola.add(tarea2);
		cola.add(tarea3);
		cola.add(tarea4);
		cola.add(tarea5);
		cola.add(tarea6);
		cola.add(tarea7);
		cola.add(tarea8);
		cola.add(tarea9);
		
		for(int i=0; i<9; i++) {
			System.out.println(cola.poll().toString());
		}
	}

}
