package com.ArrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array starts with 0. 
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 16;
		System.out.println("Array at Index 3 is = "+arr[2]);
		
		//If we try to access arr[5] or arr[-1] you will get index out of bound exception
		
		//Get length of array
		System.out.println("Array size is = "+arr.length);
		
		//iterate through array items
		for(int i = 0; i < arr.length; i++){
			System.out.println("Array item at index = "+i+ " is = "+arr[i]);
		}
	}

}
