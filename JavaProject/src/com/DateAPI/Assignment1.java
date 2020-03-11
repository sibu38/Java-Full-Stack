package com.DateAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

@FunctionalInterface
interface TemporalAdjuster {
Temporal adjustInto(Temporal temporal);
}
public class Assignment1 {
	public static void main(String []args)
	{
		LocalDate localDate=LocalDate.now();
		//System.out.println(localDate);
		//System.out.println(localDate.getDayOfMonth()+"/"+localDate.getMonth().getValue()+"/"+localDate.getYear());
		int day=localDate.getDayOfMonth();
		int month=localDate.getMonth().getValue();
		int year=localDate.getYear();
		System.out.println(day+"/"+month+"/"+year);
		LocalDate day15=localDate.plusDays(15);
		System.out.println("today -> "+localDate.getDayOfWeek());
		System.out.println("15 days from today -> "+day15.getDayOfWeek());
	}

}
