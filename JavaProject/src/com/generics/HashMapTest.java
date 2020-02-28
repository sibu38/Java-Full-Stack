package com.generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void printMapKeyValue(Map<? extends Number,?> hm)
	{
		Set<? extends Number> s=new HashSet();
		Number n=hm.get();
	}
	public static void main(String []args)
	{
		Map<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		Map<Double, Double> hm3 = new HashMap<Double, Double>();
		Map<Double, String> hm4 = new HashMap<Double, String>();
		
	}
}
