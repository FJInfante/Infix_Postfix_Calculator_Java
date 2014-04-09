package Oper;

public abstract class Operator extends BaseOperClass{

	private char operatorType;
	
	public Operator(int precedence, char operatorType) 
	{
		super(precedence);
		this.operatorType = operatorType;
	}
	
	private char getOperatorType()
	{return operatorType;}  
	
	public Character getValue()
	{ return getOperatorType(); }
	
	public abstract Operand doMath(Operand firstNumber, Operand secondNumber);
	
	@Override
	public String toString() 
	{ return Character.toString(getOperatorType()); }
}
