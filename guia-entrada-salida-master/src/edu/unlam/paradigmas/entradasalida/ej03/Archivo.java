package edu.unlam.paradigmas.entradasalida.ej03;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public int[][] leeArchivo(){
		
		int[][] luchadores = null;
		Scanner scanner = null;
		
		try {
			File file = new File("casos de prueba/ejercicio03/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			if(scanner.hasNext()) {
				int cantidad = scanner.nextInt();
				luchadores = new int[cantidad][2];
				int i = 0;
				int j = 0;
				
				while(scanner.hasNext()) {
					luchadores[i][j] = scanner.nextInt();
					if(j == 1) {
						j = 0;
						i ++;
					}
					else {
						j ++;
					}
				}
			}			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		scanner.close();
		return luchadores;
	}
	
	
	
	public void grabarArchivo(int[] luchadores) {
		
		FileWriter file = null;
		PrintWriter writer = null;
		
		try {
			file = new FileWriter("casos de prueba/ejercicio03/out/" + this.nombre + ".out");
			writer = new PrintWriter(file);
			
			for(int i = 0; i < luchadores.length; i++) {
				if(i == luchadores.length - 1) 
					writer.print(luchadores[i]);
				else
					writer.print(luchadores[i] + "\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(file != null) {
				try {
					file.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
