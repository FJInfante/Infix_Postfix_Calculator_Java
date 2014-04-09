package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;
	@Before
	public void setUp() 
	{
		calculator = new Calculator();
	}

	@After
	public void tearDown() 
	{
		calculator = null;
	}

	@Test
	public void evaluateTest_Simple() {
		String equation = "5+6";

		final double expected = 11;

		double actual = calculator.evaluate(equation);

		assertEquals(expected,actual,0);
	}
	
	@Test
	public void evaluateTest_Complex() {
		String equation = "1 + 2 * 3 - 4 / 5 * 6 + 7";

		final double expected = 9.2;

		double actual = calculator.evaluate(equation);

		assertEquals(expected,actual,0);
	}
	


}
