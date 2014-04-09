package Oper;

public class AdditionOperator extends Operator {
	
	public AdditionOperator()
	{ super(1,'+'); }

	@Override
	public Operand doMath(Operand firstNumber, Operand secondNumber) 
	{return  new Operand(firstNumber.getValue() + secondNumber.getValue());}
	
	

}
