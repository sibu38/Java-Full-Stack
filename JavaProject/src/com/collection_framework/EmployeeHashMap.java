package com.collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Date
{
	int day;
	int month;
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	int year;
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}	
	@Override
	public boolean equals(Object obj)
	{
		Date d=(Date)obj; //obj of Object type is typecasted to d of Date type 
		if(d.day==this.day && d.month==this.month)
		{
			return true;
		}
		else return false;
	}
	@Override
	public int hashCode()
	{
		return 2;
	}
}
class Employee
{
	String name;
	Date dob;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + "]";
	}
	public Employee(Date dob,String name) {
		this.name = name;
		this.dob = dob;
	}
}
public class EmployeeHashMap {
	public static void main(String []args)
	{
		Date d[]=new Date[5];
		d[0]=new Date(01,01,2000);
		d[1]=new Date(02,02,2001);
		d[2]=new Date(03,03,2002);
		d[3]=new Date(04,04,2003);
		d[4]=new Date(04,04,2004);
		
		Employee e[]=new Employee[5];
		e[0]=new Employee(d[0],"Sibu");
		e[1]=new Employee(d[1],"Subi");
		e[2]=new Employee(d[2],"Somu");
		e[3]=new Employee(d[3],"Anish");
		e[4]=new Employee(d[4],"Satwik");
		
		HashMap<Date,Employee> hm=new HashMap<Date,Employee>(); 	
		hm.put(d[0],e[0]);
		hm.put(d[1],e[1]);
		hm.put(d[2],e[2]);
		hm.put(d[3],e[3]);
		hm.put(d[4],e[4]);
		
		Iterator<Map.Entry<Date,Employee>> iterator = hm.entrySet().iterator(); 
		hm.forEach((key,value) -> {System.out.println("Key= "+key+", Value= "+value);});	
	}

}
