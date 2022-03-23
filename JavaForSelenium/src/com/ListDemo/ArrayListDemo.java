package com.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		
		//Values get added as object so no retriction on data type also has no limit on size
		obj1.add(11);
		obj1.add('M');
		obj1.add("Web driver");
		
		//add duplicate value which can not be done using Set
		obj1.add("Web driver"); 
		obj1.add(10.23);
		
		//Get all elements
		System.out.println(obj1);
		
		
		//get element as per index
		System.out.println(obj1.get(2));
		
		//iterate all elements		
		for(int i=0; i<obj1.size();i++){
			System.out.println(obj1.get(i));
		}

		//enhanced for loop
		for(Object abc:obj1){
			System.out.println(abc);
		}
		
		//Iterator
		Iterator itr= obj1.iterator();
		while(itr.hasNext()){
			Object val = itr.next();
			System.out.println("Iterator data " + val);
		}
	}

}
