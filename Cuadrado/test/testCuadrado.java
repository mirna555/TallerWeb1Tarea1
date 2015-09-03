package ar.edu.unlam.tallerweb1.tarea1;

import static org.junit.Assert.*;

import org.junit.Test;


public class testCuadrado {
	

		@Test
		public void testCalcularArea() {
			Cuadrado a = new Cuadrado(4.0);
			assertEquals((4 * 4), a.CalcularArea(), 0.01);
		}

		@Test
		public void testCalcularPerimetro() {
			Cuadrado p = new Cuadrado(3.0);
			assertEquals((3 * 4), p.CalcularPerimetro(), 0.01);
		}

		

}
