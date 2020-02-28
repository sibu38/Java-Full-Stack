package com.collection_framework;

import java.util.ArrayList;

class ReverseArrayList
{
	public ArrayList<Integer> revArrayList (ArrayList<Integer> arr)
	{
		//Declaring ArrayLIst to reverse given Arraylist of size 5
		ArrayList<Integer> revArr=new ArrayList<Integer>(5);
		
		//Reversing ArrayList arr 
		for(int i=arr.size()-1;i>=0;i--)
		{
			revArr.add(arr.get(i));
		}
		return revArr;
	}
}
public class ArrayListTest {
	
	public static void main(String []args)
	{
		//Size of ArrayList
		int n=5;
		
		ReverseArrayList obj=new ReverseArrayList();
		//Declaring ArrayLIst of size n
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		
		//Appending Elements to the ArrayList arr
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);		
		
		//Printing ArrayList
		System.out.println("Before Reversing \n" +arr);
		
		arr=obj.revArrayList(arr);
		
		//Printing Reversed ArrayList
		System.out.println("After Reversing \n"+arr );		
	}
}
