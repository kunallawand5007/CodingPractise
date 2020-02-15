/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class LetterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input="ababacada";
		char[] charArray = input.toCharArray();
		int []p1= {1,2};
		System.out.println(p1.length);
		int p[]= {2,4,3,2,1};
		char temp='1';
		for(int i=0 ;i<charArray.length;i++) {
			for(int j=0;j<charArray.length-1;j++) {
				
				if(charArray[j]>charArray[j+1]) {
					
					temp=charArray[j];
					charArray[j]=charArray[j+1];
					charArray[j+1]=temp;
				}
				System.out.println(i+":::::::::::::"+j);
			}
		}
		
		
		
		System.out.println("############################");

		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		System.out.println(new String(charArray));
		
	}

}
