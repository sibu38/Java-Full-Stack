package com.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class RandomGenTest {
	private RandomGen randomGen;
	private Integer randomNumber;
	static Random rand;
	public void RandomGenTest()
	{
		System.out.println("Constructor");
	}
	
	@Before
	public void initialise()
	{
		rand=new Random();
		randomGen=new RandomGen();
		System.out.println("Before");
	}

	@Parameterized.Parameters
	public static Collection randomNumbers()
	{
		return Arrays.asList(new Object[][] {{},{},{},{},{},{}});		
	}
	@Test
	public void test() 
	{
		int v=randomGen.randomGenerator();
		assertTrue(v<100);
		System.out.println(v);
		
	}
	
	@After
	public void afterFunct()
	{
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClassFunct()
	{
		System.out.println("After Class");
	}
}
