/**
 * 
 */
package com.alti.test;

import java.util.Scanner;

/**
 * @author implement stack 
 *
 */
public class StackMain {
	public static void main(String[] args) {
	
		
		StringBuilder stringBuilder =new  StringBuilder();
		stringBuilder.append("{");
		stringBuilder.append('"');
		stringBuilder.append("payload");
		stringBuilder.append('"');
		stringBuilder.append(":");
		stringBuilder.append('"');
		stringBuilder.append("dddd");
		stringBuilder.append('"');
		stringBuilder.append("}");
		System.out.println(stringBuilder.toString());
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int nextInt = scanner.nextInt();
		int p[] = new int[nextInt];
		System.out.println("############ Options #########");
		System.out.println("1 Push");
		System.out.println("2 POP");
		System.out.println("3 Display");
		System.out.println("4 Exit");
		int size = nextInt;
		int nextInt2=0;
		do {
			
		System.out.println("Enter your choice");
		nextInt2 = scanner.nextInt();
		
		switch (nextInt2) {
		case 1:
			System.out.println("PUSH");
			System.out.println("Enter The Element:");
			if(nextInt==0) {
				System.out.println("Stack is FULL");
			}else {
				p[nextInt-1] = scanner.nextInt();
				nextInt--;
			}
			break;
		case 2:
			System.out.println("POP:"+nextInt);
			if(size == nextInt) {
				System.out.println("Stack is underflow");
			}else {
				int j = p[nextInt];
				p[nextInt] = 0;
				System.out.println("POP Element="+j);
				nextInt++;
			}
			break;
			
		case 3:
			System.out.println("Display");
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}
			break;
		case 4:
			break;
		}
		}while(nextInt2!=4);
		
		scanner.close();
		
		
	}
	
	

}
