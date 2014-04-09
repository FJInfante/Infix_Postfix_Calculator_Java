package Oper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionOperatorTest {

	private AdditionOperator additionOperator;
	
	@Before
	public void setUp() throws Exception 
	{
		additionOperator = new AdditionOperator();
	}
	
	
	@Test
	public void getValueTest()
	{
		final char expected = '+';
		
		char actual =  additionOperator.getValue();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPrecedenceTest()
	{
		final int expected = 1 ;
		
		int actual = additionOperator.getPrecedence();
		assertEquals(expected, actual);
	}

}
