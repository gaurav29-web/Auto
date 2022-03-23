package javaQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GetCountOfArrayElements {
	public static int k=0;
	public static void main(String[] args) {
		Integer a[] = {2,3,2,3,4,3,5,9,9};
		
		//Print distinct values
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<a.length;i++){
			map.put(a[i], i);
		}
		//Get distinct characters
		System.out.println("Get distinct values " +map.keySet());
		//Get distinct char count
		System.out.println("Get distinct values count " +map.size());
        
    }
	}

