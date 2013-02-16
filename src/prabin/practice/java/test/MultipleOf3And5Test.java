package prabin.practice.java.test;
import static org.junit.Assert.*;

import org.junit.Test;

import prabin.practice.java.main.Multiple3and5;

public class MultipleOf3And5Test {
	Multiple3and5 testObject = new Multiple3and5();
	
	@Test
	public void testWhetherTheNumberIsDivisibleBy3or5andSum() throws Exception {
		int actualValue = testObject.sumOfMultiplesOf3And5();
		
		assertEquals(23, actualValue);
	}
}
