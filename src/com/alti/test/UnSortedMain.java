/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class UnSortedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1 3 8 12 4 7 0 0 0
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sie of array:");
	    int no=scanner.nextInt();
	    int ch[]=new int[no];
	    for(int i=0;i<no;i++) {
	    	System.out.println("Enter no:");
	    	int num1=scanner.nextInt();
	    	ch[i]= num1;
	    }
		
		
		for(int i=0;i<no-1;i++) {
			if(ch[i]==0) {
	               
				for(int j=i;j<no-1;j++) {
					
					ch[j]=ch[j+1];
					
				}
				ch[no-1]=0;
			}
			
		}
		

	
		
		
		
		System.out.println("###################3");
		for(int i=0;i<no;i++) {
			System.out.print(ch[i]);
			System.out.print(" ");
			
		}
		
	
		scanner.close();
	}

}
