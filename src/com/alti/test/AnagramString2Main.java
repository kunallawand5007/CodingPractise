/**
 * 
 */
package com.alti.test;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <p>
 * Simple program for checking string is anagram or not
 * </p>
 * 
 * @author Kunal Lawand
 *
 */
public class AnagramString2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1st String");

		String first = scanner.next();

		System.out.println("Enter 2nd String");

		String second = scanner.next();

		List<Character> collect = first.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		List<Character> collect2 = second.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		collect.sort((s1, s2) -> {
			return s1.compareTo(s2);
		});

		Collections.sort(collect2);

		boolean flag = true;

		for (int i = 0; i < collect.size(); i++) {

			if (collect.get(i) != collect2.get(i)) {
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println("Anagram..!!");
		} else {
			System.out.println("Not Anagram..!!");
		}

		scanner.close();

	}

}
