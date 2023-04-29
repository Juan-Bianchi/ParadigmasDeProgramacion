package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		int[][] respuesta;
		if(m.length > 0) {
			respuesta = new int[m.length * 2 - 1][];
		
		
			int filaRes = 0;
			
			for(int fila = m.length - 1; fila >= 0; fila--) {
				
				int i = fila;
				int j = 0;
				respuesta[filaRes] = new int [m.length - fila];
				int colRes = 0;
				
				while( i < m.length) {
					respuesta[filaRes][colRes] = m[i][j];
					i ++;
					j ++;
					colRes ++;
				}
				filaRes ++;
			}
			
			int cantFilas = m.length - 1;
			for(int columna = 1; columna < m.length; columna ++) {
				
				int i = 0;
				int j = columna;
				respuesta[filaRes] = new int [cantFilas];
				int colRes = 0;
				
				while( j < m.length) {
					respuesta[filaRes][colRes] = m[i][j];
					i ++;
					j ++;
					colRes ++;
				}
				filaRes ++;
				cantFilas --;
			}
		}
		else {
			respuesta = m;
		}

		return respuesta;
	}
}
