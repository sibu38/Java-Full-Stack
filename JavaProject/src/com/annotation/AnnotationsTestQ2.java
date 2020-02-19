package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Getter{
}
class Func{
	int age;
	public void func(int age){
		this.age=age;
	}
	@Getter
	public int getAge(){
		return this.age;
	}
	@Getter
	public void deploy(){
		System.out.println("Not getAge() Func");
	}
}
class AnnotationsTestQ2{
	public static void main(String []args) throws Exception{
		Class c=Class.forName("com.annotation.Func");
		Method m[]=c.getDeclaredMethods();
		
		for(int i=0;i<m.length;i++){
			Method myMethod=m[i];
			Annotation annotations[]=myMethod.getAnnotations();
			for(int j=0;j<annotations.length;j++){
				String str=annotations[j].annotationType().getName();
				//System.out.println(str);
				//to check Getter
				if (str.equals("Getter")){
					String temp=m[i].getName();
					String temp2=temp.substring(3);
					temp2=temp2.toLowerCase();
					System.out.println(temp2);
					Field fields[]=c.getDeclaredFields();
					for(int k=0;k<fields.length;k++){
						if((fields[k].getName()).equals(temp2)){
							System.out.println("@Getter Annotataion is used in "+temp2+" Method");
					}
						else
							System.out.println("@Getter Annotation not working properly.");
					}
				
				}
			}
		}
	}
}
						
					
					
		
		