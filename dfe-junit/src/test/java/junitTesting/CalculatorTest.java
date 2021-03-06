package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c;
	
	@Before
	public void init() {
		c=new Calculator();
	}
	
	@Test
	public void addTest() {
//		int a=1;
//		int b=2;
		//int sum =c.add(a, b);
		assertEquals(3,c.add(1, 2));
	}
	@Test
	public void subTest() {
//		int a=1;
//		int b=2;
		//int sum =c.add(a, b);
		assertEquals(1,c.subtract(2, 1));
	}
	@Test
	public void ConditionalTrueTest() {
		assertEquals(12,c.conditionalCalc(10, 2, true));
	}
	@Test
	public void ConditionalFalseTest() {
		assertEquals(8,c.conditionalCalc(10, 2, false));
	}
}
