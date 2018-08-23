package o_cla.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator c;
	
	@Before
	public void inicializa() {
		c = new Calculator();
	}
	
	@Test
	public void calcularVariasSomasTest() {
		int resp = c.evaluate("5+3+2");
		assertEquals(10,resp);
	}
	
	@Test
	public void calcularSoUmNumeroTest() {
		int resp = c.evaluate("5");
		assertEquals(5,resp);
	}

}
