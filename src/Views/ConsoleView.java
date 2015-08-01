package Views;

import java.util.Scanner;

public class ConsoleView {
	
	public String displayRequest()
	{
		System.out.print("Please enter an equation: ");
		Scanner input = new Scanner(System.in);
		String equation = input.next();
		return equation;
	}
	
	public void displayResults(double answer)
	{
		System.out.println("The ansews is " + answer);
	}

}
