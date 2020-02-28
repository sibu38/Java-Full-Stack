package com.collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	double weight;
	double height;
	String name;
	public Person(String name, double weight, double height) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	@Override
	public int compareTo(Person p) {
		if(this.weight==this.weight) {
			if(this.height > p.height) {
				return 1;
			}
			else if (this.height < p.height){
				return -1;
			}
			else {
				return 0;
			}
		}
		else {
		if(this.weight > p.weight) {
			return 1;
		}
		else if (this.weight < p.weight){
			return -1;
		}
		else {
			return 0;
		}
	}
}
	@Override
	public String toString() {
		return "Person [Name=" + name + " Height= "+ height + " Weight= " + weight + "]";
	}
}

public class PersonSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTreeSet();
	}
	private static void PersonTreeSet()
	{
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("A",60.0,5.4));
		treeSet.add(new Person("B",70.0,5.6));
		treeSet.add(new Person("C",60.0,5.7));
		treeSet.add(new Person("D",45.0,5.3));
		treeSet.add(new Person("E",80.0,6.2));
		treeSet.add(new Person("F",70.0,5.5));
		
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Person a = itr.next();
			System.out.println(a);
		}
	}
}
