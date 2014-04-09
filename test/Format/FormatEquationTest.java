package Format;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatEquationTest {



	@Test
	public void formatEquationTest_Simple() {
		final String  stringUnformattedEquation = "5+6";
		
		final String expected = "5 + 6";
		String actual = FormatEquation.formatEquation(stringUnformattedEquation);
		
		assertEquals(expected,actual);				
	}
	
	@Test
	public void formatEquationTest_Complex() {
		final String  stringUnformattedEquation = "10+15-6/17";
		
		final String expected = "10 + 15 - 6 / 17";
		String actual = FormatEquation.formatEquation(stringUnformattedEquation);
		
		assertEquals(expected,actual);				
	}

}
