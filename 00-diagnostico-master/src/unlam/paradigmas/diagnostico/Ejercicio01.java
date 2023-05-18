package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	public static boolean resolver(int[][] m) {
		
		int suma = 0;
		boolean cumpleSuma = true;
		for(int i = 0; i < m.length && cumpleSuma; i++) {
			if(i != 0) {
				cumpleSuma = suma == m[i][i];
			}
			suma += m[i][i];			
		}
		return cumpleSuma;
	}
}
