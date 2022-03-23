package com.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//LinkedHashSet -- get data with insertion order
				LinkedHashSet<String> vals1 = new LinkedHashSet<>();
				vals1.add("Selenium");
				vals1.add("QTP");
				vals1.add("Ranorax");
				vals1.add("VSTS");
				vals1.add("Soap UI");
				
				//Output is not ordered
				System.out.println(vals1);
				
				//Iterator  - you can not get size so use enhanced for loop
				for(String val:vals1){
					System.out.println(val);
				}

	}

}
