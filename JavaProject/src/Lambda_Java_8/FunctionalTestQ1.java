package Lambda_Java_8;

import java.util.Scanner;
import Lambda_Java_8.Operator;

@FunctionalInterface
interface Operator
{
	double operate(int a,int b);
}
public class FunctionalTestQ1 {
	
	public static void main(String []args)
	{
		System.out.println("Enter value of a and b.");
		Scanner Sc=new Scanner(System.in);
		int p=Sc.nextInt();
		int q=Sc.nextInt();
		Operator opr;
		opr=(a,b)->p+q;
		System.out.println("Addition = "+opr.operate(p,q));
		
		opr=(a,b)->p-q;
		System.out.println("Subtraction = "+opr.operate(p,q));
		
		opr=(a,b)->p*q;
		System.out.println("Multiplication = "+opr.operate(p,q));
		
		opr=(a,b)->p/q;
		System.out.println("Division = "+opr.operate(p,q));
	}
}
