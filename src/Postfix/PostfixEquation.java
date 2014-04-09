package Postfix;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import Oper.BaseOperClass;
import Oper.Operator;

public class PostfixEquation {
	private List<BaseOperClass> postfixEquationArray = new ArrayList<BaseOperClass>();
	
	public List<BaseOperClass> getPostfixEquationArray()
	{
		return Collections.unmodifiableList(postfixEquationArray); 
	}
	
	public void convertInfixArrayToPostFixArray(List<BaseOperClass> infixEquationArray)
	{
		Stack<BaseOperClass> tempStack = new Stack<BaseOperClass>();
		
		for(BaseOperClass token : infixEquationArray)
		{
			if(token instanceof Operator)
			{
				while(tempStack.size() != 0 && tempStack.peek().getPrecedence() >= token.getPrecedence())
				{
					this.postfixEquationArray.add(tempStack.pop());
				}
				tempStack.push(token);
			}
			else
			{
				this.postfixEquationArray.add(token);
			}
		}
		while(tempStack.size() !=0)
		{
			this.postfixEquationArray.add(tempStack.pop());
		}
	}
}
