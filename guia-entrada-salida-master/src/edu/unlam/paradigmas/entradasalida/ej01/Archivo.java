package edu.unlam.paradigmas.entradasalida.ej01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Archivo {

	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Integer> leerArchivo() {
		Scanner scanner = null;
		Set<Integer> datos = new HashSet<>();
		ArrayList<Integer> respuesta = new ArrayList<>();
		
		try {
			File file = new File("casos de prueba/ejercicio01/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			scanner.nextInt();
			
			while(scanner.hasNext()) {
				datos.add(scanner.nextInt());
			}
			for(int numero: datos) {
				respuesta.add(numero);
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		scanner.close();
		return respuesta;
	}
	
	public void guardarArchivo(ArrayList<Integer> datos) {
		
		FileWriter file = null;
		PrintWriter printWriter = null;
		
		try {
			file = new FileWriter("casos de prueba/ejercicio01/out/" + this.nombre + ".out");
			printWriter = new PrintWriter(file);
			int tam = datos.size();
			
			for(int i = 0; i < tam; i++) {
				if(tam - 1 == i) 
					printWriter.print(datos.get(i));
				else
					printWriter.print(datos.get(i) + "\n");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			if (file != null) {
				try {
					file.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
