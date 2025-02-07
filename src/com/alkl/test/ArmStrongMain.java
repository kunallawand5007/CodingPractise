/**
 * 
 */
package com.alkl.test;

import java.util.Scanner;

/**
 * <p> Simple program for armstrong number </p>
 * 
 * @author Kunal Lawand
 *
 */
public class ArmStrongMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number");

		int nextInt = scanner.nextInt();
		
		int r=0;
		int q=99;
		int result=0;
		int d=nextInt;
		while (q!=0) {
			r=d%10;
			q=d/10;
			result=result+(r*r*r);
			d=q;
		}
		
		if(result==nextInt) {
			System.out.println("Armstrong Number..!!!!!");
		}else {
			System.out.println("Not a Armstrong Number..!!!!!");
		}

		
		scanner.close();
		 
		
	}
}
