/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author klawand
 *
 */
public class BreakingRecordMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int p[]= {10,5,5,4,2,1,5,4,2};
		List<Integer> integers=new ArrayList<Integer>(p.length);
		for (int i = 0; i < p.length; i++) {
			integers.add(p[i]);
		}	
		
		integers.sort((i1,i2)->i2.compareTo(i1));
		System.out.println(integers);
		
		int max=integers.get(0);
		System.out.println(10>5);
		
		Set<Integer> maxList=new HashSet<>();
		
			for (Integer integer : integers) {
				
				if(max>integer) {
					maxList.add(integer);
				}
			}
		
		System.out.println(maxList);
		
		integers.sort((i1,i2)->i1.compareTo(i2));
		System.out.println(integers);
		
		Set<Integer> maxList1=new HashSet<>();
		int max1=integers.get(0);
		for (Integer integer : integers) {
			
			if(max1>integer) {
				maxList1.add(integer);
			}
		}

		System.out.println(maxList1);
		
	
	}

}
