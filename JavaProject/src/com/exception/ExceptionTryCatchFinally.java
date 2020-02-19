package com.exception;

public class ExceptionTryCatchFinally {
	public static void main(String[]args)
	{
		int a=15;
		int b=0;
		//int b=3;
		try 
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();		
		}
		finally
		{
			System.out.println("Finally().");
		}
	}
}