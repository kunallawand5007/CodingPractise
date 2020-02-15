/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class PatternMain2 {

	/**
	 * @param args
	 * @return
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
/*		*000*000*
		0*00*00*0
		00*0*0*00
		000***000
	*/	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();

		System.out.println("Enter element size:");
		int element = scanner.nextInt();

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < element; j++) {

				if (i == j || j == element / 2 || 8 == i + j) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}

			}
			System.out.println();

		}

		scanner.close();

	}

}
