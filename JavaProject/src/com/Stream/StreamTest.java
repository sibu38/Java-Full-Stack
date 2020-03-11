package com.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
	
	public static void main(String []args)
	{
		List<String> str=new ArrayList<String>();
		str.add("Ankit");
		str.add("Siba");
		str.add("Pritam");
		str.add("Sameer");
		str.add("Rajat");
		str.add("Amar");
		str.add("Anish");
		
		str.stream().filter((String s)->s.startsWith("A")).sorted().forEach(System.out::println);
	}
}
