/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class FibMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nextLine = scanner.nextLine();

		System.out.println(nextLine);
		
		int start=97;
		String[] split = nextLine.split(" ");
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<split.length;i++) {
			map.put(start, Integer.valueOf(split[i]));
			start++;
		}
		System.out.println(map);
		
		String next = scanner.next();
		char[] charArray = next.toCharArray();
		List<Integer> integers=new ArrayList<Integer>(charArray.length);
 		for (int i = 0; i < charArray.length; i++) {
			 integers.add(map.get((int)charArray[i]));
		}
 		
 		System.out.println(integers);
 		
 		
 		Integer integer = integers.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
 		System.out.println(integer*next.length());
 		
 		
		scanner.close();
	}

}
