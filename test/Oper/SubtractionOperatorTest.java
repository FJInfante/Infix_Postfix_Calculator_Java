package Oper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubtractionOperatorTest {

	private SubtractionOperator subtractionOperator;
	@Before
	public void setUp() throws Exception 
	{
		subtractionOperator = new SubtractionOperator();
	}
	
	
	@Test
	public void getValueTest()
	{
		final char expected = '-';
		
		char actual = subtractionOperator.getValue();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPrecedenceTest()
	{
		final int expected = 1 ;
		
		int actual = subtractionOperator.getPrecedence();
		assertEquals(expected, actual);
	}

}
