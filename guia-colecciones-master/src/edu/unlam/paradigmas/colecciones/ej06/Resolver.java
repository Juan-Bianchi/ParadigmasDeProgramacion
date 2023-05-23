package edu.unlam.paradigmas.colecciones.ej06;

public class Resolver {

	public void resolver() {
		
		Estudiante estudiante1 = new Estudiante("Pedro", 11555666);
		Estudiante estudiante2 = new Estudiante("Bruce Wayne", 22655666);
		Estudiante estudiante3 = new Estudiante("Peter Parker", 33452666);
		Estudiante estudiante4 = new Estudiante("Clark Kent", 11222333);
		Estudiante estudiante5 = new Estudiante("Bruce Banner", 44555777);
		
		
		estudiante1.agregarNota(10);
		estudiante1.agregarNota(6);
		
		estudiante2.agregarNota(8);
		estudiante2.agregarNota(4);
		
		estudiante3.agregarNota(1);
		estudiante3.agregarNota(3);
		
		estudiante4.agregarNota(9);
		estudiante4.agregarNota(9);
		
		estudiante5.agregarNota(6);
		estudiante5.agregarNota(8);
			
			
		EstadisticasEstudiante estadistica = new EstadisticasEstudiante();
		estadistica.agregarEstudiante(estudiante1);
		estadistica.agregarEstudiante(estudiante2);
		estadistica.agregarEstudiante(estudiante3);
		estadistica.agregarEstudiante(estudiante4);
		estadistica.agregarEstudiante(estudiante5);
		
		System.out.println(estadistica.generarEstadisticaPorPromedio());
	}
}
