package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NumberList {
	public static void printArrayList(List<? extends Number> list)
	{
		Iterator<?> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main (String []args)
	{
		List<Integer> n=new ArrayList<Integer>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);		
		printArrayList(n);
		
		List<Double> n1=new ArrayList<Double>();
		n1.add(10.23);
		n1.add(20.34);
		n1.add(30.56);
		n1.add(40.78);
		n1.add(50.98);
		n1.add(60.87);
		printArrayList(n1);
		
		/*List<String> n2=new ArrayList<String>();
		n2.add("SIBU");
		n2.add("SOMU");                                     ERROR
		printArrayList(n2);*/
	}
}
