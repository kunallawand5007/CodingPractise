/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author klawand
 *
 */
public class QueuMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Queue:");
		int nextInt = scanner.nextInt();
		int p[] = new int[nextInt];
		System.out.println("############ Options #########");
		System.out.println("1 Insert");
		System.out.println("2 Delete");
		System.out.println("3 Display");
		System.out.println("4 Exit");
		int nextInt2 = 0;
		int head = 0;
		int trail = 0;
		do {

			System.out.println("Enter your choice");
			nextInt2 = scanner.nextInt();

			switch (nextInt2) {
			case 1:
				System.out.println("Insert");
				if (trail == p.length) {
					System.out.println("Queue is FULL");
				} else {
					p[trail] = scanner.nextInt();
					trail++;
				}
				break;
			case 2:
				System.out.println("Delete:"+head);
				if(head ==p.length) {
					System.out.println("Queue is Empty");
					trail = 0;
				}else {
					int j = p[head];
					p[head] = 0;
					System.out.println("Delete:"+j);
					head++;
					if(head ==p.length) {
						trail =0;
					}
				}
				break;

			case 3:
				System.out.println("Display");
				for(int i=0;i<p.length;i++) {
					System.out.println(p[i]);
				}
				break;
			case 4:
				break;
			}
		} while (nextInt2 != 4);

		scanner.close();

	}

}
