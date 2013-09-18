/**
 * RomanCONVERT class converts Roman numerals to decimal
 * values. You must enter the Roman numerals through the
 * command line arguments
 * 
 * @author Wood Morgan
 * @version 09/12/2013
 *
 */
public class RomanCONVERT {
	/**
	 * Converts a Roman numeral to a decimal
	 * @param roman A String to be parsed
	 * @return The decimal value of roman
	 */
	public static void romanToDecimal(String roman)	{
		
		int decimal = 0;
		int lastChar = 0;
		String romanNumeral = roman.toUpperCase();
		for(int i = romanNumeral.length() - 1; i >= 0; i--){
		
			char convertToDecimal = roman.charAt(i);
			
			switch	(convertTodecimal)
			{
			case 'M':
				decimal = processNumeral(1000, lastChar, decimal);
				break;
				
			case 'D':
				decimal = processNumeral(500, lastChar, decimal);
				break;
				
			case 'C':
				decimal = processNumeral(100, lastChar, decimal);
				break;
				
			case 'L':
				decimal = processNumeral(50, lastChar, decimal);
				break;
				
			case 'X':
				decimal = processNumeral(10, lastChar, decimal);
				break;
				
			case 'V':
				decimal = processNumeral(5, lastChar, decimal);
				break;
				
			case 'I':
				decimal = processNumeral(1, lastChar, decimal);
				break;
			}
		}
	}
	
	public static int processNumeral(int decimal, int lastChar, int lastDecimal) {
		if (lastChar > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}
	
	
	/**
	 * Main method for the class.
	 * @param args
	 */
	public static void main(String[] args)	{
		if(args.length < 1){
		{System.err.println("Invalid number of arguments supplied");
		}
		else	{
			//traversing an array == use a for loop
			for(int i = 0; i < args.length; i++){
				System.out.println(args[i] + " ==> " + romanTodecimal(args[i]));
	
	
		}
	}
}



