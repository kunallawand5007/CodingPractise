/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class Pattern9Main {

	/*
	
12345
1234
123
12
1

	 
	 */
	
	

	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();

		System.out.println("Pattern Output:");
		
		for (int i = 0; i <= size; i++) {

			for (int j = 1; j <= size-i; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		scanner.close();
		

	}

}
