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
public class MatrixMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter sizze of array:");
		int size = scanner.nextInt();
		
		
		char a[][]=new char[size][size];
		
		System.out.println(a.length);
		
		
//		for(int i=0;i<size;i++){
//	        String str = scanner.next();
//	        System.out.println(str);    
//	        String[] split = str.split("#");
//	        System.out.println("L="+split.length);
//	        }
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the elemeny:"); 
			 String str = scanner.next();
		     System.out.println(str);    
		     String[] split = str.split("#");
			for (int j= 0 ;j<a.length;j++) {
				
				System.out.println(i+"::"+j);
				
				//int el = scanner.next().charAt(0);
				//a[i][j]= (char)el;
				a[i][j]= split[j].toCharArray()[0];
				System.out.println("A["+i+"]"+ " "+"["+j+"]"+"=="+a[i][j]);
			}
		}
		
		
		
		
		int count =0;
		char p[]=new char[size];
		int k=0;
		List<String> list=new ArrayList<String>();
	
		System.out.println("######### Read Horizontally ###########");
		for (int i = 0; i < a.length; i++) {
			for (int j= 0 ;j<a.length;j++) {
				
				System.out.println("A["+i+"]"+ " "+"["+j+"]"+"=="+a[i][j]);
				p[k]=a[i][j];
				k++;
			}
			list.add(new String(p));
			k=0;
		}
		System.out.println("Horizontal :"+list);
		
		
		System.out.println("####### Read vertically ########");
		int counter=0;
		int i=0;
		while (counter!=a.length) {
			
			for ( i= 0; i < a.length; i++) {
				System.out.println("A["+i+"]"+ " "+"["+counter+"]"+"=="+a[i][counter]);
				p[k]=a[i][counter];
				k++;
			}
			list.add(new String(p));
			k=0;
			counter++;
			i=0;
		}
		System.out.println("Vertical :"+list);
		
		System.out.println("########## Diagonally-Top-End #########");
		for(int s=0;s<a.length;s++) {
			p[k]=a[s][s];
			k++;
		}
		list.add(new String(p));
		k=0;
		System.out.println("Diagonal :"+list);
		
		System.out.println("############ Diagonal- END-Top #######");
		int m=0;
		for(int q=a.length-1;q>=0;q--) {
			p[k]=a[q][m];
			m++;
			k++;
		}
		list.add(new String(p));
		k=0;
		System.out.println("Diagonal 2:"+list);
		
		
		System.out.println("Enter search string:");
		String next = scanner.next();
		
		long count2 = list.stream().filter(s->s.equals(next)).count();
		
		System.out.println("Count="+count2);
		scanner.close();
	}
	
	

}
