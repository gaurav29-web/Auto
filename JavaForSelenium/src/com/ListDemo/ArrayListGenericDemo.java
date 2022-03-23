package com.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		
		//With generics Type is limited but size is not a concern. Generics help reducing performance and storage issues
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Gaurav");
		obj1.add("Selenium");
		//Set inserts data by replacing existing data, add- adds data and shifts existing data to right
		obj1.set(1, "QTP");
		obj1.add(1, "UFT");
 		System.out.println(obj1); //[Gaurav, UFT, QTP]
		
 		//For single line we dont need opening and closing braces
		for(String val:obj1)
		System.out.println(val);
		
		//You can use parent of array list to get its methods
		//Example1-
		List<String> obj2 = new ArrayList<String>();
		obj2.add("test1223");
	}

}
