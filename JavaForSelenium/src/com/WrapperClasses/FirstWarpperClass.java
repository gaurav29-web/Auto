package com.WrapperClasses;

public class FirstWarpperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		System.out.println("Primitive "+a);
		
		//b here is object of integer type with refernce for value of 200. Check it through debugger
		Integer b = 200;
		System.out.println("Warpper "+b);
		
		//called Integer Wrapper class to convert string price to integer
		String c= "10";
		System.out.println(Integer.parseInt(c));
		
		//Autoboxing- Primitive to wrapper
		int x = 100;
		Integer y = x;
		System.out.println(y);
		
		//Boxing - Primitive to wrapper
		int m = 20;
		Integer n = Integer.valueOf(m);
		System.out.println(n);
		
		//Auto Unboxing - Wrapper to Primitive
		Integer marks2 = 98;
		int marks3 = marks2;
		System.out.println(marks3);
		
		//Unboxing  - Wrapper to Primitive
		Integer marks = 98;
		int marks1 = marks.intValue();
		System.out.println(marks1);
		
		
	}

}
