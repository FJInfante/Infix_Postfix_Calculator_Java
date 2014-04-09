package Infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Oper.BaseOperClass;
import Oper.Operand;
import Oper.Operator;

public class InfixEquationTest {

	private final String  stringEquation = "5 + 6";

	private InfixEquation infixEquation;
	
	@Before
	public void setUp()
	{
		infixEquation = new InfixEquation();
	}

	@After
	public void tearDown()
	{
		infixEquation = null;
	}
	
	@Test
	public void createInfixEquationArray_getValueTest() {
		infixEquation.createInfixEquationArray(stringEquation);

		final double firstThing_expected = 5;
		final char secondThing_expected = '+';
		final double thirdThing_expected = 6;
		
		List<BaseOperClass> infixEquationArray = infixEquation.getInfixEquationArray();
		
		double firstThing_actual = (Double) infixEquationArray.get(0).getValue();
		char secondThing_actual = (Character) infixEquationArray.get(1).getValue();
		double thirdThing_actual = (Double) infixEquationArray.get(2).getValue();
		
		assertEquals(firstThing_expected, firstThing_actual,0);
		assertEquals(secondThing_expected, secondThing_actual);
		assertEquals(thirdThing_expected, thirdThing_actual,0);
	}
	
	@Test
	public void createInfixEquationArray_getTypeTest()
	{
		infixEquation.createInfixEquationArray(stringEquation);
		
		List<BaseOperClass> infixEquationArray = infixEquation.getInfixEquationArray();
		
		assertTrue(infixEquationArray.get(0) instanceof Operand);
		assertTrue(infixEquationArray.get(1) instanceof Operator);
		assertTrue(infixEquationArray.get(2) instanceof Operand);
	}
	
	

}
