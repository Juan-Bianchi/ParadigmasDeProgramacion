package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] m) {
		
		int [][] resultado = new int[m.length][];
		
        for (int i = 0; i < m.length; i++) {
            resultado[i] = m[i].clone();
        }
		
		for(int i = 0; i < m.length; i++) {
			
			for(int j = 0; j < m[i].length; j++) {
				
				if(j < m[i].length - 1) {
					resultado[i][j] += m[i][j+1];
				}
				if(j > 0) {
					resultado[i][j] += m[i][j-1];
				}
				
				if(i > 0) {
					if(m[i-1].length > j) {
						resultado[i][j] += m[i-1][j];
					}
				}
				if(i < m.length - 1) {
					if(m[i+1].length > j) {
						resultado[i][j] += m[i+1][j];
					}
				}
				
			}
		}
		
		return resultado;
	}
}
