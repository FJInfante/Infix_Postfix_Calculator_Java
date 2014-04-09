package Oper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DivisionOperatorTest {

	private DivisionOperator divisionOperator;
	
	@Before
	public void setUp() throws Exception 
	{
		divisionOperator = new DivisionOperator();
	}
	
	@Test
	public void getValueTest()
	{
		final char expected = '/';
		
		char actual =  divisionOperator.getValue();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPrecedenceTest()
	{
		final int expected = 2 ;
		
		int actual = divisionOperator.getPrecedence();
		assertEquals(expected, actual);
	}

}
