package com.exception;

public class ExceptionMultipleCatch {
	public static void main(String []args)
	{
		int arr[]=new int[5];
		try
		{
			for(int i=0;i<arr.length;i++) {
				arr[i]=i+1;
			}
			System.out.println("Multiple Catch Block");
			arr[8]=15;			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
