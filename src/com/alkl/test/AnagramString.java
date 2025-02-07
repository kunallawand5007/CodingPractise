/**
 * 
 */
package com.alkl.test;

import java.util.Scanner;

/**
 * <p>
 * Simple program for checking given string anagram or not
 * </p>
 * 
 * @author Kunal Lawand
 *
 */
public class AnagramString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1st String");

		String first = scanner.next();

		System.out.println("Enter 2nd String");

		String second = scanner.next();

		char[] firstCharArray = first.toCharArray();

		char[] secondCharArray = second.toCharArray();

		if (firstCharArray.length != secondCharArray.length) {
			System.out.println("Strings are not anagram..!!!!!!!!!");
			return;
		}

		boolean flag = true;
		int counter = 0;

		for (int i = 0; i < firstCharArray.length; i++) {

			if (counter == 5) {
				counter = 0;
				flag = false;
				break;
			}

			for (int j = 0; j < secondCharArray.length; j++) {

				if (firstCharArray[i] == secondCharArray[j]) {
					flag = true;
					break;
				} else {
					flag = false;
					counter++;
					continue;
				}

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
