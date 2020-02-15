/**
 * 
 */
package com.alti.test;

/**
 * @author klawand
 *
 */
public class SelectionSortMain {

	/**
	 * link:https://www.studytonight.com/data-structures/selection-sorting
	 * @param args
	 */
	public static void main(String[] args) {

		// int input[] = { 4, 3, 2, 10, 12, 1, 5, 6 };

		// int input[] = { 12, 11, 13, 5, 6 };
		// int input[] = { 5,1,6,2,4,3 };
		// int input[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
		 int input[] = {2,4,6,8,3};
		//int input[] = { 2, 3, 7, 8, 10, 13, 5 };
		// int input[] = {1,3,5,9,13,22,27,35,46,51,55,83,87,23};

		int mini = 0;
		int lowerindex = 0;
		int startIndex = 0;
		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			startIndex = i;
			mini = input[i];
			for (int j = i + 1; j < input.length; j++) {

				if (mini > input[j]) {
					mini = input[j];
					lowerindex = j;
				}
			}
			if(lowerindex>0) {
				temp = input[startIndex];
				input[startIndex] = input[lowerindex];
				input[lowerindex] = temp;
				
			}

		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");

		for (int i = 0; i < input.length; i++) {
			int j = input[i];
			System.out.println(j);
		}

	}

}
