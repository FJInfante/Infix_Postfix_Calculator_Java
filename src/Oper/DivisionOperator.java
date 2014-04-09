package Oper;

public class DivisionOperator extends Operator {

	public DivisionOperator()
	{ super(2,'/'); }
	
	@Override
	public Operand doMath(Operand firstNumber, Operand secondNumber) 
	{return  new Operand(secondNumber.getValue() / firstNumber.getValue());}
}
