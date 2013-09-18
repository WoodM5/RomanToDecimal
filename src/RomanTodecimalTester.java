import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * 
 * @author Wood Morgan
 *
 */

public class RomanTodecimalTester {

	@Test
	public void romanTodecimalTester() {
		assertEquals(RomanToDecimal.romanToDecimal("CCLIX"),259);
		assertEquals(RomanToDecimal.romanToDecimal("IV"),4);
		assertEquals(RomanToDecimal.romanToDecimal("MCMLXXXIII"),1983);
		assertEquals(RomanToDecimal.romanToDecimal("MXXI"),1021);
		assertEquals(RomanToDecimal.romanToDecimal("I-am-mud"),2501);
		assertEquals(RomanToDecimal.romanToDecimal("IIIVIIIXIIC"),121);
	}
		

}
