package com.exception;

public class ExceptionTryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=0;
		//int b=3;
		try 
		{
			int c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Finally().");
		}
	}
}