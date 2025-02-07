/**
 * 
 */
package com.alkl.test.pattern;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class Pattern7Main {

  /*
	
A
BB
CCC
DDDD
EEEEE
FFFFFF
	
	
	
 */	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size:");
		int nextInt = scanner.nextInt();
		//as capital letter ascii start with '65'
		for (int i = 65; i < nextInt+65; i++) {
			
			for(int j=65;j<i+1;j++) {
				System.out.print((char)i);
			}
			System.out.println();
			
			
		}

		scanner.close();

	}
		

	}


