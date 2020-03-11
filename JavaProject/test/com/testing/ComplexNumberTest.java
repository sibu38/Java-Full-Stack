package com.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ComplexNumberTest {
	
	
	
	private  ComplexNumber complexnumber1;
	private  ComplexNumber complexnumber2;

	private  ComplexNumber parity;
	
	public ComplexNumberTest(int r1, int c1, int r2, int c2)
	{
		complexnumber1=new ComplexNumber(r1,c1);
		complexnumber2=new ComplexNumber(r2,c2);
		parity=new ComplexNumber(r1+r2,c1+c2);
		System.out.println("constructor");
	}
	
	@Before
	public void function()
	{
		System.out.println("Inside function()");
				
	}
	
	@Parameterized.Parameters
	public static Collection func() 
	{
		System.out.println("func()");
		
		return Arrays.asList(new Object[][] {{1,2,1,2}});
		
	}

	@Test
	public void test() 	
	{
		System.out.println("hello world");
		
		ComplexNumber temp=complexnumber1.add(complexnumber1, complexnumber2);
		System.out.println("temp: "+temp);
		assertTrue(temp.equals(parity));
	}

}