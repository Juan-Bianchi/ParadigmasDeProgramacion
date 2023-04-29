package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {
		if(m.length == 0) {
			return false;
		}
		
		double mult = 1;
		for(int i = 0; i < m.length && mult != 0 ; i++) {
			for(int j = 0; j < m[i].length; j++) {
				mult *= m[i][j];
			}
		}
		return mult == 0;
	}
}
