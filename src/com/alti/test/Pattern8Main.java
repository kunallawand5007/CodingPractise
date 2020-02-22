/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class Pattern8Main {


	/*
	
	
1111111111
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1111111111

	
	*/
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();

		System.out.println("Pattern Output:");
		int start = 0;
		int end = size - 1;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				if (i == start || i == end) {
					System.out.print("1");
				} else if (start == j || end == j) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}
		scanner.close();

	}

}
