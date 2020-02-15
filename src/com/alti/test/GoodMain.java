/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author klawand
 *
 */
public class GoodMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		List<Character> l = new ArrayList<>();
		for (int i = 0; i < nextInt; i++) {
			System.out.println("Enter second:");
			String next = scanner.next();
			System.out.println(next);

			 Object findAntiDode = findAntiDode(next.toCharArray());
			 if(findAntiDode instanceof List) {
				 System.out.println(true);
				 List<Character> characters=(List<Character>) findAntiDode;
				  characters.forEach(System.out::println);
			 }else {
				 int ine=(int)findAntiDode;
				 
				 System.out.println((char)ine);
			 }

		}

		scanner.close();

	}

	static Object findAntiDode(char[] charArray) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < charArray.length; i++) {

			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], 1);
			} else {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}

		}

		System.out.println(map);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		List<Integer> integers = new ArrayList<>();
		List<Character> characters = new ArrayList<>();
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				integers.add((int) entry.getKey());
			}
		}

		if (integers.isEmpty()) {
			for(int i=0;i<charArray.length;i++) {
				characters.add(charArray[i]);
			}

			return characters;
		}

		System.out.println(integers);

		integers.sort((i1, i2) -> i1.compareTo(i2));

		return integers.get(0);
	}

}
