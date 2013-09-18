/**	
 * RomanCONVERT class converts Roman numerals to decimal
 * values. You must enter the Roman numerals through the
 * command line arguments
 * 
 * These people helped me: 
 * 
 * @author Wood Morgan
 * @version 09/12/2013
 *
 */

import java.util.Scanner;

public class RomanToDecimal {
	/**
	 * Converts a Roman numeral to a decimal
	 * @param roman A String to be parsed
	 * @return The decimal value of roman
	 */
	public static int romanToDecimal(String roman)	{
		
		int decimal = 0;
		
		roman = roman.toUpperCase();
		for(int i = roman.length() - 1; i >= 0; i--)	{
		
			char convertToDecimal = roman.charAt(i);
			
			switch	(convertToDecimal)
			{
				case 'M':
				decimal += (1000);
				break;
				
				case 'D':
				decimal += (500);
				break;
				
				case 'C':
				decimal += (100);
				break;
				
				case 'L':
				decimal += (50);
				break;
				
				case 'X':
				decimal += (10);
				break;
				
				case 'V':
				decimal += (5);
				break;
				
				case 'I':
				decimal += (1);
				break;
				
			}
		}
		if(roman.contains("IV"))
			decimal -=2;
		if(roman.contains("IX"))
			decimal -=2;
		if(roman.contains("XL"))
			decimal -=20;
		if(roman.contains("XC"))
			decimal -=20;
		if(roman.contains("CD"))
			decimal -=200;
		if(roman.contains("CM"))
			decimal -=200;
		
			return decimal;
	}
	
	/**
	 * Main method for the class.
	 * @param args
	 */
	public static void main(String[] args)	{
		
		Scanner reader= null;
		if(args.length > 1){
			for(int i = 0; i < args.length; i++){
			System.out.println(args[i] + " ==> " + romanToDecimal(args[i]));}
		while(true)
			try {
			reader = new Scanner(System.in);
			System.out.println("Enter your Roman Numeral:");
			String roman = reader.nextLine();
			System.out.println("You roman numeral," + roman + " translates to " + romanToDecimal(roman) + " in decimal form.");
			} catch (Exception e) {
				e.printStackTrace(); }
		
		
			}
		}
	}




