package Format;

public class FormatEquation {
	
	public static String formatEquation(String equation)
	{
		String temp = equation.replaceAll("//s", "");
		return temp.replaceAll("(?<=\\d)\\s*([-+/*])\\s*(?=\\d)", " $1 ");
	}

}
