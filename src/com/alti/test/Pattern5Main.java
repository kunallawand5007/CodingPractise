/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class Pattern5Main {

	
	//program for pattern
	/*
	 0
909
89098
7890987
678909876
56789098765
4567890987654
345678909876543
23456789098765432
1234567890987654321

	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();
		
		System.out.println("Pattern Output:");
		
		for(int i=0;i<size;i++) {
			
			
			for(int j=i;j>0;j--) {
				System.out.print(size-j);
			}
			
			System.out.print(0);
			
			int p=size-1;
			for(int k=i;k>0;k--) {
				System.out.print(p);
				p--;
			}
			
			System.out.println();
		}
		
		scanner.close();
		
		

	}

}
