package com.JavaTests;

import java.util.ArrayList;

public class CommonValInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,5};
		int b[]= {1,2,3,2};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length-1;i++){
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		Object[] c = al.toArray();
		for(Object d:c){
			System.out.println(d);
		}
		
	}

}
