package com.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAssign {
	
	public static void main(String []args)
	{	
		//Assignment 1
		List<Fruit> fruitList=TestData.getAllFruits();
		List<Fruit> calories=fruitList.stream().filter((Fruit f)->f.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories)).collect(Collectors.toList());
		System.out.println("Fruits <100 Calories: ");
		TestData.printFruits(calories);
		
		//Assignment 2
		Map<String,List<Fruit>> fruitsByColour=fruitList.stream().collect(Collectors.groupingBy(Fruit::getColor));
		//TestData.printFruits(fruitsByColour); ERROR
		System.out.println("\nFruits by colour : \n"+fruitsByColour);
		
		//Assignment 3
		List<Fruit> redAscending=fruitList.stream().filter((Fruit f)->f.getColor()=="Red").sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		System.out.println("\nRed Fruits in Ascending order:");
		TestData.printFruits(redAscending);
		
		//Assignment 4
		List<News> newsList=TestData.getAllNews();
		Map<Integer,List<News>>idList=newsList.stream().collect(Collectors.groupingBy(News::getNewsId));
		//System.out.println(idList);
		Integer maxValuesString = idList.entrySet().stream()
	            .max(Comparator.comparingInt(entry -> entry.getValue().size()))
	            .map(Map.Entry::getKey).orElse(null);
		System.out.println("\nMax Id value : "+maxValuesString);
		
		//Assignment 5
		long c=newsList.stream().filter((News n)->n.getComment().contains("budget")).count();
		System.out.println("\nNo. of times Budget came into picture : "+c);
			
		//Assignment 6
		Map<String,List<News>> commentByUser=newsList.stream().collect(Collectors.groupingBy(News::getCommentByUser));
		System.out.println(commentByUser);
		
		//Assignment 7
		List<Transaction> transactionList=TestData.getAllTransactions();
		List<Transaction> valueList2011=transactionList.stream().filter((Transaction t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getYear)).collect(Collectors.toList());
		System.out.println("\nTransactions in 2011 Ascending : \n"+valueList2011);
		
		//Assignment 8
		//List<Transaction> uniqueCity=transactionList.stream().filter(distinctByKey((Transaction t)->t.getTrader().getCity())).collect(Collectors.toList());
		
		
	}

}
