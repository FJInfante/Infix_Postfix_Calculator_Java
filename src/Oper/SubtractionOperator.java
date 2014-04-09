package Oper;

public class SubtractionOperator extends Operator{

	public SubtractionOperator()
	{ super(1,'-'); }
	
	@Override
	public Operand doMath(Operand firstNumber, Operand secondNumber) 
	{return  new Operand(secondNumber.getValue() - firstNumber.getValue());}
}
