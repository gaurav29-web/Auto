package com.classDemo;

public class FirstClassDemo {
int x = 10;
int y = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Since method is not static we need to first create object of class
		FirstClassDemo obj1 = new FirstClassDemo();
		obj1.sum();
		
		//Since method defined is static can be directly used by class. operator
		StaticClassDemo.sum(20, 15);
	}
	
	public void sum(){
		int a = 2;
		int b= 3;
		System.out.println("Sum of two numbers --- "+(a+b));
	}
	

}
