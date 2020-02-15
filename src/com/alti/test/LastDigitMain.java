/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class LastDigitMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no:");
		int number=scanner.nextInt();
		System.out.println("Enter power on N:");
		String n=scanner.next();
		int remainder=0;
		
		remainder = number*Integer.valueOf(n)%10;
		System.out.println(remainder);
		scanner.close();
		
		

	}

}
