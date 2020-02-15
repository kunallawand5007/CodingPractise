/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class SportsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Test case count:");
		
		int nextInt = scanner.nextInt();
		List<Integer>  integers =new ArrayList<Integer>();
		List<Integer>  result = new ArrayList<>();
 		
		for (int i = 0; i < nextInt; i++) {
			
			
			int nextInt2 = scanner.nextInt();
			integers.add(nextInt2);
			
		}
		
		
		
		for (Integer integer : integers) {
			
			int questient= integer/2;
			if(integer%2==0) {
				result.add(questient+1);
			}else   {
			   result.add(questient+2+1);
			}
			
		}
		
		result.forEach(System.out::println);
		
		scanner.close();

	}

}
