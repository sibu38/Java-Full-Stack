package com.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c;	
	@Before
	public void initialise()
	{
	c=new Calculator();
	System.out.println("Before");
	}

	@Test
	public void testDivide() {
		assertEquals(5,c.divide(15,3));
		//fail("Not yet implemented");
		System.out.println("Test Divide 1");
	}
	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class,
				()->c.divide(10, 0));
		System.out.println("Test By Zero 1");
	}
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero2() {
		assertEquals(5,c.divide(15,0));
		//fail("Not yet implemented");
		System.out.println("Test By Zero 2");
	}
	@Test
	public void testDivide2() {
		assertEquals(2,c.divide(8,4));
		//fail("Not yet implemented");
		System.out.println("Test Divide 2");
	}
	@Test
	public void testSum() {
		assertEquals(10,c.sum(5, 5));
		//fail("Not yet implemented");
		System.out.println("Test Sum 1");
	}
	@Test
	public void testSum2() {
		assertEquals(15,c.sum(7, 8));
		//fail("Not yet implemented");
		System.out.println("Test Sum 2");

	}
	
	@Test
	public void testSum3() {
		assertEquals(20,c.sum(15, 5));
		//fail("Not yet implemented");
		System.out.println("Test Sum 3");

	}
	@Test
	@Ignore
	public void testDiff() {
		fail("Not yet implemented");
	}
	
	/*@Test(timeout=1000)
	public void testWithTimeout()
	{
		assertEquals(1,c.loop());
	}*/

}
