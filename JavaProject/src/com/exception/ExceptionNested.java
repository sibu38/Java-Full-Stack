package com.exception;

public class ExceptionNested {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=0;
		System.out.println("Main()");
		try 
		{
			c=b/a;
			System.out.println("1st Try block");
			int arr[]=new int[5];
			try 
			{
				for(int i=0;i<arr.length;i++) 
				{
					arr[i]=1;
				}
			System.out.println("2nd Try block.");
			arr[7]=5;
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				e.printStackTrace();
				System.out.println("2nd Catch block");
			}
		}
		catch(ArithmeticException e) 
		{
					e.printStackTrace();
					System.out.println("1st Catch block");
		}
				
		/*Finally{
		System.out.println("Finally Block");
		}*/
	}
}

