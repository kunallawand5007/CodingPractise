/**
 * 
 */
package com.alti.test;

/**
 * @author klawand
 *
 */
public class InserationSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int input[] = { 12, 11, 13, 5, 6 };
		// int input[] = { 5,1,6,2,4,3 };
		//int input[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
		//  int  input[] = {2,4,6,8,3};
		 // int  input[] = {2,3,7,8,10,13,5};
		int input[] = {1,3,5,9,13,22,27,35,46,51,55,83,87,23}; 
		
		int count = 0;
		for (int i = 1; i < input.length; i++) {

			count = i;
			while (count != 0) {
				if (input[i - count] > input[i]) {
					int temp = input[i - count];
					input[i - count] = input[i];
					input[i] = temp;
				}
				count--;
			}
			
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j]);
				System.out.print(" ");
			}
            System.out.println();
			
		}

		

	}

}
