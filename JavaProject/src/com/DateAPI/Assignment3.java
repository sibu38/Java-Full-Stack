package com.DateAPI;

import java.time.LocalDate;
import java.time.Period;

public class Assignment3 {
	public static void main(String []args)
	{
		LocalDate localDate=LocalDate.now();
		int year=localDate.getYear();
		int month=localDate.getMonth().getValue();
		int day=localDate.getDayOfMonth();
		
		if(localDate.isLeapYear()==true && month<=2 && day<=29)
		{	
			LocalDate targetDate=LocalDate.of(year,2,29);
			Period daysInterval=Period.between(localDate, targetDate);
			System.out.println("Days Remaining = "+daysInterval.getDays()+" days, "+daysInterval.getMonths()+" months, "+daysInterval.getYears()+" years");	
		}
		else
		{
			LocalDate targetDate=LocalDate.of((localDate.getYear()+4)-(localDate.getYear()%4),2,29);
			Period daysInterval=Period.between(localDate, targetDate);
			System.out.println("Days Remaining to leap year from now : "+daysInterval.getDays()+" days, "+daysInterval.getMonths()+" months, "+daysInterval.getYears()+" years");
		}
	}
}
