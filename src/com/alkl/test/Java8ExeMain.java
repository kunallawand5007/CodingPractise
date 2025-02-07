/**
 * 
 */
package com.alkl.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author klawand
 *
 */
public class Java8ExeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//promblem-1 Average Value (Java 8 Lambdas and Streams)
		
		List<Integer> avg =new ArrayList<Integer>();
		
		avg.add(2);
		avg.add(3);
		avg.add(5);
		avg.add(7);
		avg.add(10);
		
		double asDouble = avg.stream().mapToInt(p->p).average().getAsDouble();
		
		System.out.println(asDouble);
		
		IntSummaryStatistics summaryStatistics = avg.stream().mapToInt(s->s).summaryStatistics();
		
		System.out.println(summaryStatistics.getAverage());
		
		
		//promblem-2 Convert to Upper Case (Java 8 Lambdas and Streams)
		
		List<String> strs=new ArrayList<>();
		
		strs.add("kunal");
		strs.add("lawand");
		strs.add("satish");
		
		List<String> collect = strs.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
	     collect.forEach(System.out::println);
	     
	   //promblem-3 Filter Strings (Java 8 Lambdas and Streams)  
	    //, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters 
	     
	   List<String> list=new ArrayList<>();
		
	   list.add("aaa");
	   list.add("bb");
	   list.add("aa");
	   list.add("abh");
	
	   List<String> collect2 = list.stream().filter(s->s.startsWith("a")&& s.length()==3).collect(Collectors.toList());  
	   System.out.println(collect2); 
	
	   //Write a method that returns a comma separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. 
	   //For example, if the input list is (3,44), the output should be 'o3,e44'. 
	
	   
		List<Integer> comm = new ArrayList<Integer>();

		comm.add(4);
		comm.add(8);
		comm.add(7);	
		comm.add(15);

		
		String collect3 = comm.stream().map(s->s%2==0?"e"+s:"o"+s).collect(Collectors.joining(","));
		System.out.println(collect3);
		

		Integer integer = comm.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//System.out.println(integer);
		
		comm.sort((s1,s2)->s1.compareTo(s2));
		
	}
	
	

}
