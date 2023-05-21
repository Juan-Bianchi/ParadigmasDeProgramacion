package edu.unlam.paradigmas.basicas.ej01;
import static edu.unlam.paradigmas.basicas.ej01.Rango.creaRangoMaximo;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbierto;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbiertoADerecha;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbiertoAIzquierda;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoCerrado;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class RangoTest {
	
	@Test(expected = LimiteIncorrectoRango.class)
	public void creaRangoConLimitesIncorrectos() {
		Rango rango = crearRangoCerrado(-2.0,-3.0);
	}
	
	@Test
	public void creaRangoAbiertoOk() {
		// Arrange 
		boolean expected = true;
		Rango rango = crearRangoAbierto(1, 1);
		// Act
		boolean obtained = rango.esAbierto();
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;		
	}
	
	
	@Test
	public void creaRangoCerradOk() {
		// Arrange 
		boolean expected = true;
		Rango rango = crearRangoCerrado(1, 1);
		// Act
		boolean obtained = rango.esCerrado();
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;		
	}
	
	
	@Test
	public void creaRangoAbiertoADerOk() {
		// Arrange 
		boolean expected = true;
		Rango rango = crearRangoAbiertoADerecha(1, 1);
		// Act
		boolean obtained = rango.esAbiertoADerecha();
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;		
	}
	
	
	@Test
	public void creaRangoAbiertoAIzqOk() {
		// Arrange 
		boolean expected = true;
		Rango rango = crearRangoAbiertoAIzquierda(1, 1);
		// Act
		boolean obtained = rango.esAbiertoAIzquierda();
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;		
	}
	

	@Test
	public void traeLimiteInfOk() {
		// Arrange
		Rango rango = crearRangoAbierto(1,1);
		double expected = 1;
		double tolerance = 0.001;
		// Act
		double obtained = rango.getInicio();
		// Assert
		Assert.assertEquals(expected, obtained, tolerance);
		//Annihilate
		rango = null;		
	}
	
	@Test
	public void traeLimiteSupOk() {
		// Arrange
		Rango rango = crearRangoAbierto(1, 1);
		double expected = 1;
		double tolerance = 0.001;
		// Act
		double obtained = rango.getFin();
		// Assert
		Assert.assertEquals(expected, obtained, tolerance);
		//Annihilate
		rango = null;		
	}
	
	
	@Test
	public void traeNumeroFueraDeRangoPorIzq() {
		// Arrange 
		double number = -1;
		Rango rango = crearRangoAbierto(-1, 8);
		boolean expected = false;
		// Act
		boolean obtained = rango.estaDentroDelRango(number);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
	}
	
	@Test
	public void traeNumeroFueraDeRangoPorDer() {
		// Arrange 
		double number = 8;
		Rango rango = crearRangoAbierto(-1, 8);
		boolean expected = false;
		// Act
		boolean obtained = rango.estaDentroDelRango(number);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
	}
	
	@Test
	public void traeNumeroDentroDelRango() {
		// Arrange 
		double number = 8;
		Rango rango = crearRangoCerrado(-1, 8);
		boolean expected = true;
		// Act
		boolean obtained = rango.estaDentroDelRango(number);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
	}
	
	
	@Test
	public void traeOtroRangoFueraDeRango() {
		// Arrange 
		Rango otroRango = crearRangoAbiertoADerecha(-1, 8);
		Rango rango = crearRangoAbierto(-1, 8);
		boolean expected = false;
		// Act
		boolean obtained = rango.estaDentroDelRango(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
	}
	
	
	@Test
	public void traeOtroRangoDentroDeRango() {
		// Arrange 
		Rango otroRango = crearRangoAbierto(-1, 8);
		Rango rango = crearRangoAbierto(-1, 8);
		boolean expected = true;
		// Act
		boolean obtained = rango.estaDentroDelRango(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	
	@Test 
	public void tieneInterseccionTotal1() {
		// Arrange 
		Rango rango = crearRangoAbiertoAIzquierda(-1, 8);
		Rango otroRango = crearRangoAbierto(0, 7);
		boolean expected = true;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test 
	public void tieneInterseccionTotal2() {
		// Arrange 
		Rango rango = crearRangoAbiertoAIzquierda(0, 7);
		Rango otroRango = crearRangoAbierto(-1, 8);
		boolean expected = true;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	
	@Test 
	public void noTieneInterseccionAIzq1() {
		// Arrange 
		Rango rango = crearRangoCerrado(-8, -3);
		Rango otroRango = crearRangoAbierto(-10, -8);
		boolean expected = false;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test 
	public void noTieneInterseccionAIzq2() {
		// Arrange 
		Rango rango = crearRangoAbierto(-10, -8);
		Rango otroRango = crearRangoCerrado(-8, -3);
		boolean expected = false;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test 
	public void noTieneInterseccionADer1() {
		// Arrange 
		Rango rango = crearRangoCerrado(-8, -3);
		Rango otroRango = crearRangoAbierto(-3, 7);
		boolean expected = false;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test 
	public void noTieneInterseccionADer2() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		Rango otroRango = crearRangoCerrado(-3, 7);
		boolean expected = false;
		// Act
		boolean obtained = rango.hayInterseccion(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test
	public void verificaDosRangosIgualesOk() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		Rango otroRango = crearRangoAbierto(-8, -3);
		boolean expected = true;
		// Act
		boolean obtained = rango.esIgualRango(otroRango);
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	
	@Test
	public void rangoParametroMenorPorInicio() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		Rango otroRango = crearRangoAbierto(-10, -3);
		boolean expected = true;
		// Act
		boolean obtained = rango.ordenaRango(otroRango) > 0;
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	
	@Test
	public void rangoParametroMenorPorFinal() {
		// Arrange 
		Rango rango = crearRangoAbierto(-10, 0);
		Rango otroRango = crearRangoAbierto(-10, -3);
		boolean expected = true;
		// Act
		boolean obtained = rango.ordenaRango(otroRango) > 0;
		// Assert
		Assert.assertEquals(expected, obtained);
		// Annihilate
		rango = null;
		otroRango = null;
	}
	
	@Test 
	public void traeRangoCuandoNoHayInterseccion() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		Rango otroRango = crearRangoCerrado(-3, 7);
		double limInf = 0;
		double limSup = 0;
		double tolerancia = 0.001;
		// Act
		Rango obtained = rango.calcularInterseccion(otroRango);
		// Assert
		Assert.assertEquals(limInf, obtained.getInicio(), tolerancia);
		Assert.assertEquals(limSup, obtained.getFin(), tolerancia);
		// Annihilate
		rango = null;
		otroRango = null;
		obtained = null;
	}
	
	@Test 
	public void traeRangoCuandoHayInterseccion() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		Rango otroRango = crearRangoCerrado(-5, 7);
		double limInf = -5;
		double limSup = -3;
		double tolerancia = 0.001;
		// Act
		Rango obtained = rango.calcularInterseccion(otroRango);
		// Assert
		Assert.assertEquals(limInf, obtained.getInicio(), tolerancia);
		Assert.assertEquals(limSup, obtained.getFin(), tolerancia);
		// Annihilate
		rango = null;
		otroRango = null;
		obtained = null;
	}
	
	
	@Test 
	public void creaRangoMaximoOk() {
		// Arrange 
		Collection<Rango> rangos = new ArrayList<>();
		rangos.add(crearRangoAbierto(-8, -3));
		rangos.add(crearRangoCerrado(-5, 7));
		double limInf = -8;
		double limSup = 7;
		double tolerancia = 0.001;
		// Act
		Rango obtained = creaRangoMaximo(rangos);
		// Assert
		Assert.assertEquals(limInf, obtained.getInicio(), tolerancia);
		Assert.assertEquals(limSup, obtained.getFin(), tolerancia);
		// Annihilate
		rangos = null;
		obtained = null;
	}
	
	@Test 
	public void desplazaALaIzqOk() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		int desplazamiento = -8;
		double limInf = -16;
		double limSup = -11;
		double tolerancia = 0.001;
		// Act
		Rango obtained = rango.desplazarRango(desplazamiento);
		// Assert
		Assert.assertEquals(limInf, obtained.getInicio(), tolerancia);
		Assert.assertEquals(limSup, obtained.getFin(), tolerancia);
		// Annihilate
		rango = null;
		obtained = null;
	}
	
	
	@Test 
	public void desplazaALaDerOk() {
		// Arrange 
		Rango rango = crearRangoAbierto(-8, -3);
		int desplazamiento = 8;
		double limInf = 0;
		double limSup = 5;
		double tolerancia = 0.001;
		// Act
		Rango obtained = rango.desplazarRango(desplazamiento);
		// Assert
		Assert.assertEquals(limInf, obtained.getInicio(), tolerancia);
		Assert.assertEquals(limSup, obtained.getFin(), tolerancia);
		// Annihilate
		rango = null;
		obtained = null;
	}
}
