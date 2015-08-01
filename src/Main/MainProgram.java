package Main;

import Calculator.Calculator;
import Views.ConsoleView;

public class MainProgram {

	public static void main(String[] args) {
		ConsoleView cv = new ConsoleView();
		String equation = cv.displayRequest();
		
		Calculator calculator = new Calculator();

		double answer = calculator.evaluate(equation);
		cv.displayResults(answer);
	}

}
