package com.DateAPI;

import java.time.LocalTime;
import java.time.ZoneId;

public class Assignment2 {
	public static void main(String []args)
	{
		LocalTime localTime=LocalTime.now(); //Time ri8 now
		if(localTime.getHour()>=12)
		{
		System.out.println("Current Time = "+localTime+" PM");
		}
		else
		{
			System.out.println("Current Time = "+localTime+" AM");
		}
		int h=localTime.getHour();
		int m=localTime.getMinute();
		int s=localTime.getSecond();
		
		LocalTime time12=LocalTime.of(12,0,0);
		System.out.println("Target Time = "+time12+" PM");
		int h1=time12.getHour();
		int m1=time12.getMinute();
		int s1=time12.getSecond();
		
		int hrDiff;
		int minDiff;
		int secDiff;
		if(h>=12)
		{
			hrDiff=h1+23-h;
			minDiff=m1+59-m;
			secDiff=s1+60-s;
		}
		else
		{
			hrDiff=h1-1-h;
			minDiff=m1+59-m;
			secDiff=s1+60-s;
		}
		System.out.println("Time Diff = "+hrDiff+" hrs, "+minDiff+" mins, "+secDiff+" secs");		
	}
}
