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
public class ScannerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < no1; i++) {
			integers.add(scanner.nextInt());
		}
		int no2= scanner.nextInt();
		for (int i = 0; i < integers.size(); i++) {
				if(no2<=integers.get(i)) {
					count++;
				}
		}

		System.out.println(count);

		scanner.close();
	}

}
