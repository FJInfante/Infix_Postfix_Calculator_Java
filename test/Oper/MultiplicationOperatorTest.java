package Oper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationOperatorTest {

	private MultiplicationOperator multiplicationOperator;
	
	@Before
	public void setUp() throws Exception 
	{
		multiplicationOperator = new MultiplicationOperator();
	}
	
	@Test
	public void getValueTest()
	{
		final char expected = '*';
		
		char actual =  multiplicationOperator.getValue();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPrecedenceTest()
	{
		final int expected = 2 ;
		
		int actual = multiplicationOperator.getPrecedence();
		assertEquals(expected, actual);
	}

}
