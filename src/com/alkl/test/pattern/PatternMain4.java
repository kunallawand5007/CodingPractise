/**
 * 
 */
package com.alkl.test.pattern;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class PatternMain4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = scanner.nextInt();
		System.out.println("Enter element size:");
		int element = scanner.nextInt();
		int count=0;
		int count1=size;
		for(int i=0;i<size;i++) {
			count=0;
			count1=size;
			for (int j = 1; j <= element; j++) {
				//System.out.print(j);
		        if(count!=4) {
		        	System.out.print(j);
		        	count++;
		        }else {
		        	System.out.print(count1);
		        	count1--;
		        }
		        
		        
			}
			System.out.println();
		}

		
		scanner.close();
	}

}
