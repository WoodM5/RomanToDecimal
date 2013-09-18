import static org.junit.Assert.*;

import org.junit.Test;


public class MethodsTester {

	@Test
	public void test() {
		int a = 7, b = 13, c = -34, d = 59, e = 0;
		
		assertEquals(Methods.add(a, b), 20);
		assertEquals(Methods.add(b, c), -21);
		assertEquals(Methods.add(c, d), 25);
		assertEquals(Methods.add(d, e), 59);
	}

}
