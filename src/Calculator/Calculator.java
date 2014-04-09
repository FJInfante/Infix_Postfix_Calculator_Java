package Calculator;

import java.util.Stack;

import Format.FormatEquation;
import Infix.InfixEquation;
import Oper.BaseOperClass;
import Oper.Operand;
import Oper.Operator;
import Postfix.PostfixEquation;

public class Calculator {


	public double evaluate(String equation)
	{	
		InfixEquation infixEquation = new InfixEquation();
		PostfixEquation postfixEquation = new PostfixEquation();
		Stack<BaseOperClass> tempStack = new Stack<BaseOperClass>();

		String formattedEquation = FormatEquation.formatEquation(equation);
		infixEquation.createInfixEquationArray(formattedEquation);
		postfixEquation.convertInfixArrayToPostFixArray(infixEquation.getInfixEquationArray());

		for(BaseOperClass token : postfixEquation.getPostfixEquationArray())
		{			
			if(token instanceof Operator)
				tempStack.push(((Operator) token).doMath((Operand)tempStack.pop(), (Operand)tempStack.pop()));		
			else
				tempStack.push(token);
		}

		return (Double) tempStack.pop().getValue() ;
	}

}
