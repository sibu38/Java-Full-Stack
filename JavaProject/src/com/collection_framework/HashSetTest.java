package com.collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hash Set :");
		testHashSet();
		System.out.println("Linked Hash Set :");
		testLinkedHashSet();
		System.out.println("\nInteger Hash Set :");
		testIntHashSet();
		System.out.println("Linked Integer Hash Set :");
		testLinkedIntHashSet();
	}
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		hset.add("XYZ");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testIntHashSet() {
		Set<Integer> hset = new HashSet<Integer>();
		hset.add(1);
		hset.add(5);
		hset.add(3);
		hset.add(2);
		hset.add(5);
		
		Iterator<Integer> itr = hset.iterator();
		while(itr.hasNext()) {
			int no = itr.next();
			System.out.println(no);
		}
	}
	private static void testLinkedIntHashSet() {
		Set<Integer> hset = new LinkedHashSet<Integer>();
		hset.add(1);
		hset.add(5);
		hset.add(3);
		hset.add(2);
		hset.add(5);
		
		Iterator<Integer> itr = hset.iterator();
		while(itr.hasNext()) {
			int no = itr.next();
			System.out.println(no);
		}
	}	
	private static void testLinkedHashSet() {
			Set<String> hset = new LinkedHashSet<String>();
			hset.add("ABC");
			hset.add("XYZ");
			hset.add("PQR");
			hset.add("XYZ");
			
			Iterator<String> itr = hset.iterator();
			while(itr.hasNext()) {
				String name = itr.next();
				System.out.println(name);
			}
	}
}
