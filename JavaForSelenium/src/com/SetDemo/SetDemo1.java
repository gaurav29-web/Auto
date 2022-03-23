package com.SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		HashSet<String> vals = new HashSet<String>();
		vals.add("Selenium");
		vals.add("QTP");
		vals.add("Ranorax");
		vals.add("VSTS");
		vals.add("Soap UI");
		
		//Output is not ordered
		System.out.println(vals);
		
		//Iterator  - you can not get size so use enhanced for loop
		for(String val:vals){
			System.out.println(val);
		}
		
		//Use parent set
		Set<String> setvals = new HashSet<String>();
		setvals.add("Selenium");
		setvals.add("QTP");
		setvals.add("Ranorax");
		setvals.add("VSTS");
		setvals.add("Soap UI");
		
		//Output is not ordered
		System.out.println(setvals);
		
		//Iterator  - you can not get size so use enhanced for loop
		for(String val:setvals){
			System.out.println(val);
		}
		
		
		//Convert SET to List
		ArrayList<String> list = new ArrayList<String>(setvals);
		//Now we can get value from index
		System.out.println(list.get(2));
	}
	
	
	

}
