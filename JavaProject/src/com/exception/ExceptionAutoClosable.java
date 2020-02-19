package com.exception;

class A implements AutoCloseable
{
	public void display() 
	{
		System.out.println("display()");
	}
	public A()
	{
		System.out.println("Constructor A");
	}
	@Override
	public void close()
	{
		System.out.println("Closing");
	}
}
public class ExceptionAutoClosable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(A ob=new A())
		{			
			ob.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
