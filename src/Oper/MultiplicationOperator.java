package Oper;

public class MultiplicationOperator extends Operator {

	public MultiplicationOperator()
	{ super(2,'*'); }
	
	@Override
	public Operand doMath(Operand firstNumber, Operand secondNumber) 
	{return  new Operand(firstNumber.getValue() * secondNumber.getValue());}
}
