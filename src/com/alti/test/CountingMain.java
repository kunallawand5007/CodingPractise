/**
 * 
 */
package com.alti.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author klawand
 *
 */
public class CountingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array Size:");
		int no=scanner.nextInt();
		System.out.println("Enter element in array:");
		Integer p[]=new Integer[no];
		for(int i=0;i<no;i++) {
			int nextInt = scanner.nextInt();
			p[i]=nextInt;
		}
		scanner.close();
		System.out.println("Complete");
		
	 List<Integer> asList = Arrays.asList(p);
	 int count=0;
	 
	 for (Integer integer : asList) {
		if(integer==1) {
			count++;
			
		}
	}
	 
	 System.out.println(count);
	 
	 
	 
	}
	
	

}
