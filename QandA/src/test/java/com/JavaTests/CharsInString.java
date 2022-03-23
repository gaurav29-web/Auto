package com.JavaTests;

import java.util.ArrayList;
import java.util.HashMap;

public class CharsInString {

	//Number of charcters
	public static void main(String[] args) {
		CharsInString obj = new CharsInString();
		obj.charsInString();
	}
	
	
	
public void charsInString(){
	String name = "gaurav singh";
	ArrayList<Character> ar = new ArrayList<Character>();
	for(int i=0;i<name.length();i++){
		int t=0;
		if(!ar.contains(name.charAt(i))){
			ar.add(name.charAt(i));
			for(int j=i;j<name.length();j++){
				if(name.charAt(i)==name.charAt(j)){
					t++;
				}
			}
			System.out.println(name.charAt(i) + " --- "+t);
		}
	}
}

public void reverseString(){
	String str1 = "gaurav Singh";
	System.out.println(str1.length());
	for(int i=str1.length()-1;i>=0;i--)
		System.out.print(str1.charAt(i));
	}

public void distinctChars(){
	String str2 = "gaurav singh";
	HashMap<Character,Integer> hp = new HashMap<>();
	for(Integer i=0;i<str2.length();i++){
		hp.put(str2.charAt(i),i);
	}
	System.out.println(hp.keySet() +""+ hp.size());
}

public void distinctValinArray(){
	int a[] = {1,2,1,3,4,6,12};
	HashMap<Integer,Integer> hp1 = new HashMap<>();
	for(int i=0;i<a.length;i++){
		hp1.put(a[i], i);
	}
	System.out.println(hp1.keySet() +""+ hp1.size());
}
}
