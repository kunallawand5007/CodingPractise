/**
 * 
 */
package com.alti.test;

/**
 * @author klawand
 *
 */
public class QuickSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int input[] = { 2, 4, 6, 8, 3 };
		//int input[] = { 12, 11, 13, 5, 6 };
		int input[] = {5,1,6,2,4,3};
		int i = -1;
		int pivot = input[input.length - 1];

		for (int j = 0; j < input.length - 1; j++) {
			System.out.println(j);

			if (input[j] > pivot) {
				continue;
			}

			if (input[j] < pivot) {
				i++;
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				//swap(input [i],input[j]);
			}

		}

		System.out.println("#############");

		System.out.println("i=" + i);
		i = i + 1;
		int temp = 0;
		for (int j = i; j <= input.length - 1; j++) {

			System.out.println(j);
			if (j == 1) {
				temp = input[j];
				input[j] = input[input.length - 1];
			} else {
				int temp1 = input[j];
				input[j] = temp;
				temp = temp1;

			}

		}

		System.out.println("#############");
		for (int j = 0; j < input.length; j++) {
			System.out.println(input[j]);
		}

	}

	static void swap(int a, int b) {
		int temp = 0;

		temp = a;
		a = b;
		b = temp;
	}

}
