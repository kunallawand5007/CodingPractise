/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class PatternMain1 {

	
	/*

5432*
543*1
54*21
5*321
*4321
	
	
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();

		System.out.println("Enter element size:");
		int element = scanner.nextInt();
		
		for (int i = 0; i < size; i++) {

			int count=element;
			for (int j = 0; j<element;j++) {

				if(j+i==4) {
					System.out.print("*");
					count--;
				}else {
						System.out.print(count);
					count--;
				}
				//System.out.print(j);

			}
			System.out.println();

		}

		scanner.close();

	}

}
