package com.DateAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Assignment4 {
	
	public static void main(String []args)
	{
		String []timeZoneID=TimeZone.getAvailableIDs();
		for(String id:timeZoneID)
		{
			LocalDateTime ldt=LocalDateTime.now(TimeZone.getTimeZone(id).toZoneId());
			System.out.println(id+" "+ldt);
		}
	}

}
