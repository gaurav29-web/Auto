package com.ArrayDemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array starts with 0. 
				String arr[][] = new String[2][2];
				arr[0][0] = "Gaurav";
				arr[0][1] = "Singh";
				arr[1][0] = "Selenium";
				arr[1][1] = "Testing";

				System.out.println("Array at Index 1,1 is = "+arr[1][1]);
				
				//If we try to access arr[2][2] or arr[-1] you will get index out of bound exception
				
				//Get length of array
				System.out.println("Array size = "+arr.length);
				
				//iterate through array items
				for(int row = 0; row < arr.length; row++){
					for(int col=0; col<arr[row].length;col++){
						System.out.println("Array item at index = "+row+col+ " is = "+arr[row][col]);
					}
					
				}
			}
}
