package com.testing;

public class ComplexNumber 
{
	private int real, imaginary;
	public ComplexNumber(int x, int y)
	{
		System.out.println("inside constructor");
		real=x;
		imaginary=y;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}
	
	
	


	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Inside equals");

		ComplexNumber c=(ComplexNumber)obj;
		if (this.getReal()==c.getReal()&&this.getImaginary()==c.getImaginary())
			return true;
		else
			return false;
	}


	public int getReal() {
		return real;
	}


	public int getImaginary() {
		return imaginary;
	}


	public void setReal(int real) {
		this.real = real;
	}


	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}


	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
	}


	public ComplexNumber add(ComplexNumber x, ComplexNumber y)
	{
		ComplexNumber result=new ComplexNumber((x.getReal()+y.getReal()),(x.getImaginary()+y.getImaginary()));
		
		return result;
		
	}

}