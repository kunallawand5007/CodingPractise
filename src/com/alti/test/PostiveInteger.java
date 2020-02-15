/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class PostiveInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<5;++i) {
			System.out.println(i);
		}
		
		System.out.println(new Date());
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter no:");
		List<Integer> couts =new ArrayList<Integer>();
		int nextInt = scanner.nextInt();
		for(int i=1 ;i<nextInt;i++) {
			
			if(nextInt%i==0) {
				System.out.println(i);
				couts.add(i);
			}
	
		}
		scanner.close();
		System.out.println(couts.stream().count());
		
	}

}
