package ar.edu.unlam.tallerweb1.circulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCirculo {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void calcularAreaCirculo() {
		
		Circulo c1 = new Circulo(3d);
		
		assertEquals(28d, c1.CalcularArea(), 0.01);
	}
	@Test
	public void calcularPerimetroCirculo() {
 
		Circulo c2 = new Circulo(3d);
		
		assertEquals(28d, c2.CalcularPerimetro(), 0.01);
	}

}
