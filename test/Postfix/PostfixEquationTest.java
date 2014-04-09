package Postfix;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Oper.AdditionOperator;
import Oper.BaseOperClass;
import Oper.DivisionOperator;
import Oper.MultiplicationOperator;
import Oper.Operand;
import Oper.SubtractionOperator;

public class PostfixEquationTest {

	private PostfixEquation postfixEquation;

	@Before
	public void setUp()  
	{
		postfixEquation = new PostfixEquation();
	}

	@After
	public void tearDown()
	{
		postfixEquation = null;
	}


	@Test
	public void convertInfixArrayToPostfixArray_getValueTest_Simple()
	{
		Operand number5 = new Operand(5);
		Operand number6 = new Operand(6);
		AdditionOperator additionOperator = new AdditionOperator();

		// 5 + 6
		List<BaseOperClass> infixEquationArray = new ArrayList<BaseOperClass>();
		infixEquationArray.add(number5); infixEquationArray.add(additionOperator);infixEquationArray.add(number6);

		postfixEquation.convertInfixArrayToPostFixArray(infixEquationArray);

		//5 6 +
		List<BaseOperClass> postfixEquationArray = postfixEquation.getPostfixEquationArray();

		assertEquals(number5, postfixEquationArray.get(0));
		assertEquals(number6, postfixEquationArray.get(1));
		assertEquals(additionOperator, postfixEquationArray.get(2));
	}

	@Test
	public void convertInfixArrayToPostfixArray_getValueTest_Complex()
	{
		Operand number1 = new Operand(1);
		Operand number2 = new Operand(2);
		Operand number3 = new Operand(3);
		Operand number4 = new Operand(4);
		Operand number5 = new Operand(5);
		Operand number6 = new Operand(6);
		Operand number7 = new Operand(7);

		AdditionOperator additionOperator = new AdditionOperator();
		SubtractionOperator subtractionOperator = new SubtractionOperator();
		MultiplicationOperator multiplicationOperator = new MultiplicationOperator();
		DivisionOperator divisionOperator = new DivisionOperator();

		//1 + 2 * 3 - 4 / 5 * 6 + 7
		List<BaseOperClass> infixEquationArray = new ArrayList<BaseOperClass>();
		infixEquationArray.add(number1);infixEquationArray.add(additionOperator);
		infixEquationArray.add(number2);infixEquationArray.add(multiplicationOperator);
		infixEquationArray.add(number3);infixEquationArray.add(subtractionOperator);
		infixEquationArray.add(number4);infixEquationArray.add(divisionOperator);
		infixEquationArray.add(number5);infixEquationArray.add(multiplicationOperator);
		infixEquationArray.add(number6);infixEquationArray.add(additionOperator);
		infixEquationArray.add(number7);

		postfixEquation.convertInfixArrayToPostFixArray(infixEquationArray);

		//1 2 3 * + 4 5 / 6 * - 7 +
		List<BaseOperClass> postfixEquationArray = postfixEquation.getPostfixEquationArray();
	
		assertEquals(number1, postfixEquationArray.get(0));
		assertEquals(number2, postfixEquationArray.get(1));
		assertEquals(number3, postfixEquationArray.get(2));
		assertEquals(multiplicationOperator, postfixEquationArray.get(3));
		assertEquals(additionOperator, postfixEquationArray.get(4));
		assertEquals(number4, postfixEquationArray.get(5));
		assertEquals(number5, postfixEquationArray.get(6));
		assertEquals(divisionOperator, postfixEquationArray.get(7));
		assertEquals(number6, postfixEquationArray.get(8));
		assertEquals(multiplicationOperator, postfixEquationArray.get(9));
		assertEquals(subtractionOperator, postfixEquationArray.get(10));
		assertEquals(number7, postfixEquationArray.get(11));
		assertEquals(additionOperator, postfixEquationArray.get(12));
		
		
	}

}
