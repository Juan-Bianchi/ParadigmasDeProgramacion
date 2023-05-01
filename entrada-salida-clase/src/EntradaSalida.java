import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EntradaSalida {
	
	//CONSTANTES
	public final static String RUTA_ARCHIVO_IN = "archivosIN/";
	public final static String RUTA_ARCHIVO_OUT = "archivosOUT/";

	public static void main(String[] args) throws IOException{
		//BufferedReader
		//leerArchivoConBufferedReader("entrada.in");
		//System.out.println("La suma es : " + leerArchivoConNumerosEnterosBuffered("numerosenteros.in"));
			
		//Scanner
		//leerArchivosConScanner("entrada.in");
		//System.out.println("La suma es : " + leerArchivoConScanner("numerosenteros.in"));
		//leerArchivoPrueba("Prueba.in");
		
		//FileWriter, PrintWriter
		//escrituraDeArchivo("salida.out");
		//leerArch("archivosIN/prueba.txt")

	}
	
	////////////////////////////
	
	public static void leerArchivoConBufferedReader(String nombreArchivo) throws FileNotFoundException {
		
		File archivo = new File(RUTA_ARCHIVO_IN + nombreArchivo); //Referencia a File.
		FileReader fr = new FileReader(archivo); //Referencia a FileReader.
		BufferedReader entrada = new BufferedReader(fr); //Referencia a BufferedReader
		
		String lineaArchivo;
		
		try {
			while((lineaArchivo = entrada.readLine())!= null) {
				System.out.println(lineaArchivo);
			}
			entrada.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/////////////////////////////
	
	public static int leerArchivoConNumerosEnterosBuffered(String nombreArchivo) throws FileNotFoundException{
		
		File archivo = new File(RUTA_ARCHIVO_IN + nombreArchivo); //Referencia a File.
		FileReader fr = new FileReader(archivo); //Referencia a FileReader.
		BufferedReader entrada = new BufferedReader(fr); //Referencia a BufferedReader
		int suma = 0;
		String lineaArchivo;
		
		try {
			while((lineaArchivo = entrada.readLine())!= null) {
				String [] datos = lineaArchivo.split(" ");
				suma += Integer.parseInt(datos[0]) + 
						Integer.parseInt(datos[1]) +
						Integer.parseInt(datos[2]);
				//System.out.println("Suma parcial : " + suma);
			}
			entrada.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return suma;
	}
	
	///////////////////////////////////
	
	public static void leerArchivosConScanner(String nombreArchivo) throws FileNotFoundException {
		
		Scanner entrada = new Scanner(new File(RUTA_ARCHIVO_IN + nombreArchivo));
		
		while(entrada.hasNext()) {
			System.out.println(entrada.nextLine());
		}
		
		entrada.close();
	}
	
	//////////////////////////////////
	
	public static int leerArchivoConScanner(String nombreArchivo) throws FileNotFoundException {
		
		Scanner entrada = new Scanner(new File(RUTA_ARCHIVO_IN + nombreArchivo));
		int suma = 0;
		
		while(entrada.hasNext()) {
			suma += entrada.nextInt();
			//System.out.println("Suma parcial : " + suma);
		}
		return suma;
	}
	
	//////////////////////////////////
	
	public static void leerArchivoPrueba(String nombreArchivo) throws FileNotFoundException {
		
		Scanner archivo = new Scanner(new File(RUTA_ARCHIVO_IN + nombreArchivo));
		
		while(archivo.hasNext()) {
			String linea = archivo.nextLine();
			int nro = Integer.parseInt(linea.charAt(0) + "");
			char caracter = linea.charAt(1);
			
			System.out.println("Número: " + nro + ", caracter: " + caracter);
		}
	}
	
	/////////////////////////////////
	
	public static void escrituraDeArchivo(String nombreArchivo) throws IOException {
		
		FileWriter archivo = new FileWriter(RUTA_ARCHIVO_OUT + nombreArchivo);
		PrintWriter pw = new PrintWriter(archivo);
		
		System.out.println("Ingrese un número entero (0 para finalizar): ");
		Scanner dato = new Scanner(System.in);
		int numero = dato.nextInt();
		
		while(numero != 0) {
			pw.println(numero);
			System.out.println("Ingrese un número entero (0 para finalizar): ");
			numero = dato.nextInt();
		}
		
		archivo.close();
	}
	

}
