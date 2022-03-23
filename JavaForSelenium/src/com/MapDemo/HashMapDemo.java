package com.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> obj1 = new HashMap<String, String>();
		//Works fine since MAP is parent interface
		//Map<String, String> obj1 = new HashMap<String, String>();
		
		//add values to hash map
		obj1.put("1","Test1" );
		obj1.put("2","Test2" );
		obj1.put("3","Test3" );
		obj1.put("4","Test4" );
		obj1.put("5","Test5" );
		obj1.put("6","Test6" );
		obj1.put("7","Test7" );
		System.out.println(obj1);
		
		//duplicate key value pair will not be stored
		obj1.put("7","Test7" );
		System.out.println(obj1);
		
		//Duplicate value will Override existing value for same key
		obj1.put("7","Test9" );
		System.out.println(obj1);
		
		//Output will not be in sequence since HashMAPS stores value not in sequence
		System.out.println(obj1);
		
		//Get values-- You can get values using Keys
		
		String val = obj1.get("2");
		System.out.println(val);
		
		//Iterate using entry set
		for(Map.Entry<String, String> data: obj1.entrySet()){
			System.out.println("Get key = "+data.getKey() +" with value as = "+data.getValue() );
		}
	}

}
