//Katharine Xie(kx3jj) and Skylar Spears(srs5ab)
import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {

	@Test(timeout=100)
	public void test() {
		int whichVersion = 18; // a number such that 0 <= whichVersion < 37
		String anExpression = "1+*3"; 
		boolean valid = Expression.isValid(whichVersion, anExpression);
		
		assertTrue(valid);
		//bug number 1 -- 1+*3 should be false but is returning true
	}
	
	@Test(timeout=100)
	public void test2() {
		int whichVersion = 18;
		String expression2 = "1+(2.0 - 3)";
		boolean valid2 = Expression.isValid(whichVersion, expression2);
		assertTrue(valid2);	
		//should be false but is true
	}
	
	@Test(timeout=100)
	public void test3() {
		int whichVersion = 1;
		String expression2 = "(-3)*1";
		boolean valid2 = Expression.isValid(whichVersion, expression2);
		assertFalse(valid2);		
		//(-3)*1 is a valid expression but is returning false
	}
	
	@Test(timeout=100)
	public void test4() {
		int whichVersion = 2;
		String expression2 = "444444*****3";
		boolean valid2 = Expression.isValid(whichVersion, expression2);
		assertTrue(valid2);
		//allow multiple * sign when it shouldn't
	}
	
	
	@Test(timeout=100)
	public void test5() {
		int whichVersion = 6;
		String expression2 = "32ksdk";
		boolean valid2 = Expression.isValid(whichVersion, expression2);
		assertTrue(valid2);
		
	}


	//@Test(timeout=100)
	//public void test6() {
		//int whichVersion = 9;
		//String expression2 = "3/33";
		//boolean valid2 = Expression.isValid(whichVersion, expression2);
		//assertTrue(valid2);
		
//	}
}
