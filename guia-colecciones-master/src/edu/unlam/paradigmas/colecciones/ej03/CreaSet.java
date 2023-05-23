package edu.unlam.paradigmas.colecciones.ej03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CreaSet {
	
	public void ejecutar() {
		String cadena = "En esta cadena hay muchos caracteres En esta cadena hay muchos caracteres En esta\ncadena hay muchos caracteres En esta cadena hay muchos caracteres En esta cadena hay muchos caracteres para crear un set";
		String regex = (" |\n");
		Set<String> conjunto = new HashSet<String>(Arrays.asList(cadena.split(regex)));
		
		System.out.println(conjunto);

	}

	
	

}
