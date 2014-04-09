package Oper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperandTest {

	Operand number1;
	Operand number2;
	
	@Before
	public void setUp()
	{
		number1 = new Operand(1);
		number2 = new Operand(2);
	}
	
	@Test
	public void getValueTest()
	{
		final double expected_number1 = 1;
		final double expected_number2 = 2;
		
		double actual_number1 = number1.getValue();
		double actual_number2 = number2.getValue();
		
		assertEquals(expected_number1, actual_number1,0);
		assertEquals(expected_number2, actual_number2,0);
	}
	
	
	@Test
	public void getPrecedenceTest()
	{
		final int expected = 0;
		
		int actual = number1.getPrecedence();
		
		assertEquals(expected, actual);
	}


}
