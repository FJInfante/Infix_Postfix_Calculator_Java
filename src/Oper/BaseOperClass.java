package Oper;

public abstract class BaseOperClass {
	private int precedence;

	public BaseOperClass(int precedence)
	{ 
		this.precedence = precedence;
	}
	
	public int getPrecedence()
	{return precedence;}
	
	public abstract Object getValue();

	public Operand doMath(Operand firstNumber, Operand secondNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
