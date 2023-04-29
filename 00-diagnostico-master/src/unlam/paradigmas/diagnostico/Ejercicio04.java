package unlam.paradigmas.diagnostico;

import java.util.Arrays;

public class Ejercicio04 {

	public static int[] resolver(int[][] m) {
		int[] respuesta = new int[m.length];		
		int [][] resultado = new int[m.length][];
		int [] moda = {0,0};
		
        for (int i = 0; i < m.length; i++) {
            resultado[i] = m[i].clone();
            Arrays.sort(resultado[i]);
        }
        
       
		
		for(int i = 0; i < m.length; i++) {
			int contador = 1;
			int actual = m[i][0];
			moda[0] = actual;
			moda[1] = contador;
			for(int j = 1; j < m[i].length; j++) {
				if(m[i][j] == actual) {
					contador ++;
				}
				else {
					if(contador > moda[1] || (contador == moda[1] && actual > moda[0]) ) {
						moda[0] = actual;
						moda[1] = contador;
					}
					actual = m[i][j];
					contador = 1;
				}
			}
			if(contador > moda[1] || (contador == moda[1] && actual > moda[0]) ) {
				moda[0] = actual;
				moda[1] = contador;
			}
			respuesta[i] = moda[0];
		}	
		
		return respuesta;
	}
}
