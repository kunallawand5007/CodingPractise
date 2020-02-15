/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class BrillioMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder=new StringBuilder();
		
		Scanner scanner = new Scanner(System.in);
		int next = scanner.nextInt();
		int p[] = new int[next];
		for (int i = 0; i < next; i++) {
			System.out.println("Enter the element:");
			p[i] = scanner.nextInt();
		}
		System.out.println("element inside the list");

		for (int i = 1; i <= p.length; i++) {
			int searchElement = searchElement(i, p);
			if(searchElement==1) {
				System.out.println("Not Found="+i);
				builder.append(i+" ");
			}
		}

		System.out.println(builder.toString());
		
		scanner.close();

	}

	static int searchElement(int element, int p[]) {
		for (int j = 0; j < p.length; j++) {

			if (p[j] == element) {
				return 0;
			}

		}
		return 1;
	}

}
