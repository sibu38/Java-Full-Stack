package com.collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Date1
{
	int day;
	int month;
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	int year;
	public Date1(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}	
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
	@Override
	public int hashCode()
	{
		return 2;
	}
}
class Employee1
{
	String name;
	Date1 dob;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + "]";
	}
	public Employee1(Date1 dob,String name) {
		this.name = name;
		this.dob = dob;
	}
}
public class EmployeeHashMapQ5 {
	public static void main(String []args)
	{
		Date1 d[]=new Date1[5];
		d[0]=new Date1(01,01,2000);
		d[1]=new Date1(02,02,2001);
		d[2]=new Date1(03,03,2002);
		d[3]=new Date1(02,02,2003);
		d[4]=new Date1(04,04,2004);
		
		Employee1 e[]=new Employee1[5];
		e[0]=new Employee1(d[0],"Sibu");
		e[1]=new Employee1(d[1],"Subi");
		e[2]=new Employee1(d[2],"Somu");
		e[3]=new Employee1(d[3],"Anish");
		e[4]=new Employee1(d[4],"Satwik");
		
		HashMap<Date1,Employee1> hm=new HashMap<Date1,Employee1>(); 	
		hm.put(d[0],e[0]);
		hm.put(d[1],e[1]);
		hm.put(d[2],e[2]);
		hm.put(d[3],e[3]);
		hm.put(d[4],e[4]);
		
		Iterator<Map.Entry<Date1,Employee1>> 
		iterator = hm.entrySet().iterator(); 
		hm.forEach((key,value) -> {System.out.println("Key= "+key+", Value= "+value);});	
		
		Employee1 e1=hm.get(d[1]);
		System.out.println(e1);
	}
}
