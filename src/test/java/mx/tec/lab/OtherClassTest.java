package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		int x = 5;
		int y = 5;
		int expectedResult = x * y;
		
		OtherClass oc = new OtherClass();
		
		assertEquals(expectedResult, oc.multiply(x, y));
	}
	
	@Test
	public void testMultiply_ExceptionThrown() {
		int x = 1000;
		int y = 5;
		
		OtherClass oc = new OtherClass();
		
		try {
			oc.multiply(x, y);
		}catch(IllegalArgumentException e ) {
			assertEquals("X should be less than 1000", e.getMessage());
			
		}
	}

}
