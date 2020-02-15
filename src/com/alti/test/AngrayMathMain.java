/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class AngrayMathMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> integers = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		long nextInt = scanner.nextLong();
		int j = 2;
		for (int i = 0; i < nextInt; i++) {

			long nextInt2 = scanner.nextLong();

			for (int k = 1; k < nextInt2; k++) {

				long result = (j * j * j) * k;

				if (result == nextInt2) {
					integers.add(k);
					break;
				} else if (result > nextInt2) {
					integers.add(0);
					break;
				}
			}

		}
		scanner.close();
		integers.forEach(System.out::println);

	}

}
