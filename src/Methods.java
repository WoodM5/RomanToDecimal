
public class Methods {
	
	/*
	 *  Methods should typically be located BEFORE main
	 */
	
	/**
	 * The method add adds the two parameters together
	 * and returns the sum as an int
	 * @param int a The first number
	 * @param int b The second number
	 * @return The sum of a and b as an <codeint</code>
	 */
	public static int add(int a, int b)	{
		return a + b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args[0] + " + " + args[1] + " = " +
				"" + add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		
	}
}
