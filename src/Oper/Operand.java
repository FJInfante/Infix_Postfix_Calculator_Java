package Oper;

public class Operand extends BaseOperClass {
	
	private double doubleValue;
		
	public Operand(double value)
	{
		super(0);
		this.doubleValue = value;
	}

	
	private double getDoubleValue()
	{return doubleValue;}
	
	public Double getValue()
	{ return getDoubleValue(); }
	
	@Override
	public String toString() 
	{ return Double.toString(getDoubleValue()); }
	

}
