package unlam.paradigmas.objetos.ej01;

import org.junit.Assert;
import org.junit.Test;


public class NotaTests {
	
	@Test(expected = NotaException.class)
	public void seteaFueraRango()  throws NotaException {
		new Nota(-1);
	}
	
	@Test(expected = NotaException.class)
	public void seteaFueraRango2()  throws NotaException {
		new Nota(11);
	}
	
	@Test
	public void seteaOk() throws NotaException{
		Nota nota = new Nota(5);
		
		Assert.assertTrue(nota.obtenerValor() >= 1 && nota.obtenerValor() <= 10);
	}
	
	
	@Test
	public void obtieneNotaOk() throws NotaException {
		Nota nota = new Nota(1);
		int esperado = 1;
		
		Assert.assertEquals(esperado, nota.obtenerValor());
	}
	
	@Test
	public void aprobadoFalso() throws NotaException {
		Nota nota = new Nota(3);
		boolean esperado = false;
		
		Assert.assertEquals(esperado, nota.aprobado());
	}
	
	@Test
	public void aprobadoVerdadero() throws NotaException {
		Nota nota = new Nota(4);
		boolean esperado = true;
		
		Assert.assertEquals(esperado, nota.aprobado());
	}
	
	
	@Test
	public void desaprobadoFalso() throws NotaException {
		Nota nota = new Nota(10);
		boolean esperado = false;
		
		Assert.assertEquals(esperado, nota.desaprobado());
	}
	
	@Test
	public void desaprobadoVerdadero() throws NotaException {
		Nota nota = new Nota(1);
		boolean esperado = true;
		
		Assert.assertEquals(esperado, nota.desaprobado());
	}
	
	
	

}
