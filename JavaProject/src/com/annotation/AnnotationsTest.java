package com.annotation;

class DeprecatedSample{
	@Deprecated
	public void toPrint(){
		System.out.println("Deprected Func");
	}
}
public class AnnotationsTest{
	@SuppressWarnings({"deprecation"})
	public static void main(String []args){	
	DeprecatedSample d1=new DeprecatedSample();
	d1.toPrint();
	}
}