/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class MagicalMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int nextInt = scanner.nextInt();
		System.out.println("Enter no of column:");
		int nextInt2 = scanner.nextInt();
		char[][] magical = new char[nextInt][nextInt2];
		
		for(int i=0;i<nextInt;i++) {
			
			for(int j=0;j<nextInt2;j++) {
				
				System.out.println(i+"::"+j);
				magical[i][j] = '1';
			}
		}
		
		System.out.println("########## Display #########");
		
      for(int i=0;i<nextInt;i++) {
			
			for(int j=0;j<nextInt2;j++) {
				
			 System.out.println("Magical["+i+"]["+j+"]="+magical[i][j]);
			}
		}
		
		
		
	}

}
