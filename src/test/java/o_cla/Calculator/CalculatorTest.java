package o_cla.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEvaluateSomas() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3+8+5+9");
		assertEquals(25, resp); //
	}

	@Test
	public void testEvaluatePrimeiroNegativo() {
		Calculator c = new Calculator();
		int resp = c.evaluate("-3+8+5+9");
		assertEquals(19, resp); //
	}

	@Test
	public void testEvaluatePrimeiroPositivo() {
		Calculator c = new Calculator();
		int resp = c.evaluate("+3+8+5+9");
		assertEquals(25, resp); //
	}

	@Test
	public void testEvaluateSubtracoes() {
		Calculator c = new Calculator();
		int resp = c.evaluate("15-5-3-7-2");
		assertEquals(-2, resp);
	}
	
	@Test
	public void testEvaluateMisto() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3+8-5+4-6");
		assertEquals(4, resp);
	}
	
	@Test
	public void testEvaluateSoUmaOperacao() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3+8");
		assertEquals(11, resp);
	}
	
	@Test
	public void testEvaluateResultadoNegativo() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3-8");
		assertEquals(-5, resp);
	}
	
	@Test
	public void testEvaluateSoUmNumero() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3");
		assertEquals(3, resp);
	}

	@Test
	public void testEvaluateSoUmNumeroNegativo() {
		Calculator c = new Calculator();
		int resp = c.evaluate("-3");
		assertEquals(-3, resp);
	}

	@Test
	public void testEvaluateSoUmNumeroPositivo() {
		Calculator c = new Calculator();
		int resp = c.evaluate("3");
		assertEquals(3, resp);
	}
}