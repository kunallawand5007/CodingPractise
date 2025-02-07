/**
 * 
 */
package com.alkl.test.pattern;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class Pattern6Main {


	/*
	*
Output:

**
***
****
*****
******
 
 
 */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size:");
		int nextInt = scanner.nextInt();
		for (int i = 0; i < nextInt; i++) {
			
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}

		scanner.close();

	}

}
