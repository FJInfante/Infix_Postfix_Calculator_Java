package Infix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Oper.AdditionOperator;
import Oper.BaseOperClass;
import Oper.DivisionOperator;
import Oper.MultiplicationOperator;
import Oper.Operand;
import Oper.SubtractionOperator;

public class InfixEquation {

	private List<BaseOperClass> infixEquationArray = new ArrayList<BaseOperClass>();
	
	
	public List<BaseOperClass> getInfixEquationArray()
	{
		return Collections.unmodifiableList(infixEquationArray); 
	}
	
	public void createInfixEquationArray(String equation)
	{
		BaseOperClass token;
		for(String s: equation.split(" "))
		{
			if (s.equals("+")) token = new AdditionOperator();
			else if (s.equals("-")) token = new SubtractionOperator();
			else if (s.equals("/")) token = new DivisionOperator();
			else if (s.equals("*")) token = new MultiplicationOperator();
			
			else	token = new Operand(Double.parseDouble(s));
			
			infixEquationArray.add(token);
		}
	}
	

}
