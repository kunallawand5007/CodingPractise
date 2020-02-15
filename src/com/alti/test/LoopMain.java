/**
 * 
 */
package com.alti.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author klawand
 *
 */
public class LoopMain {

	
	public static void main(String[] args) {

		City city=new City();
		
		
		City city2 = new City(1, "1");
		
       city = city2;
       System.out.println(city.getName());
 
		List<City> list =new ArrayList<City>();
		
		
		list.add(new City(1, "1"));
		list.add(new City(2, "aa"));
		list.add(new City(3, "d"));
		
		City s=null;
		
		for (City string : list) {
			
		
			//System.out.println(string);
			for(int i=0;i<5;i++) {
				System.out.println("I="+i);
				 if(string.getName().equals("aa")) {
					 s= string;
					 break;
				 }
			}
		}
		
		System.out.println(s.getId());
		
		
		
	}
}
