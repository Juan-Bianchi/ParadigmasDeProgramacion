
public class Excepciones {
	
	private static final int DIMENSION = 3;

	public static void main(String[] args) {
		String nombre = null;
		ejemploNullPointerException(nombre);
		
		int numero = 5;
		int divisor = 0;
		ejemploArithmeticException(numero, divisor);
		
		int [] vector = new int[DIMENSION];
		ejemploArrayIndexOutOfBoundException(vector);
		
		ejemploFileNotFindException();
		

	}
	
	
	private static void ejemploFileNotFindException() {
		// TODO Auto-generated method stub
		
	}


	private static void ejemploArrayIndexOutOfBoundException(int[] vector) {
		try {
			for(int i = 0; i <= vector.length; i++) {
				vector[i] = DIMENSION * (i-1) / 2;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción capturada: " + e.toString());
		}
		
	}


	private static void ejemploArithmeticException(int numero, int divisor) {
		try {
			int cociente = numero / divisor;
			System.out.println("La división es: " + cociente);
		}
		catch(ArithmeticException e){
			System.out.println("Excepción capturada: " + e.getMessage());
		}
		finally {
			System.out.println("Posterior a la división");
		}
	}


	public static void ejemploNullPointerException(String nombre) {
		
		try {
			System.out.println("El nombre tiene: " + nombre.length() + " caracteres-");
			int tam = nombre.length();
			for(int i=1; i<tam; i++) {
				System.out.println(nombre.charAt(i));
			}
		}
		catch(NullPointerException ex) {
			System.out.println("Excepción capturada: " + ex.getMessage());
		}
	}

}
