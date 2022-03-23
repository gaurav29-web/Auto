package com.datatypes;

public class FloatDemo {

	public static void main(String[] args){
		//float a = 10.99 will throw error as data can be lost so Java asks you to change it to Double. We can cast data to float or add f in the end
		float a = (float) 10.99;
		float b = 10.99f;
		double c = 1509.90;
		
		System.out.println("Number A == " + a);
		System.out.println("Number B == " + b);
		System.out.println("Number C == " + c);
		
		//Store float or double to int by casting trims values after . --> Down cast
		int d = (int) 10.99;
		System.out.println("Number D == " + d);
	}
}
