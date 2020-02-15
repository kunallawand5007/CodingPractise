/**
 * 
 */
package com.alti.test;

/**
 * @author klawand
 *
 */
public class PanIndiaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		String s = "x#o#o#o#x#o";
		int j=0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(i+"::"+charArray[i]+"::"+(int)charArray[i]);
			
			
		}

	}

}
