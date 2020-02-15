/**
 * 
 */
package com.alti.test;

/**
 * @author klawand
 *
 */
public class HackerInserationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {2, 4, 6, 8, 3 };

		int key = input[input.length - 1];
		for (int i = 1; i < input.length - 1; i++) {

			if (input[input.length - i - 1] > key) {

				input[input.length - i] = input[input.length - i - 1];
			} else {
				input[input.length - i - 1] = key;
			}
			System.out.println();
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j]);
				System.out.print(" ");
			}

		}

	}

}
