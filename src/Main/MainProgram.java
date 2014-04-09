package Main;

import Calculator.Calculator;

public class MainProgram {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.evaluate("1+2*3-4/5*6+7"));

	}

}
