package com.thisKeywordDemo;

public class MyDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDrivers obj1 = new MyDrivers();
		
	/*	MyDrivers obj2 = new MyDrivers("");
		
		MyDrivers obj3 = new MyDrivers(2);*/
		
		//If I don't want to create three objects then I can use this keyword
		obj1.display();
	}
	
	public MyDrivers(){
		//this("JDBC");
		this(10);
		System.out.println("load drivers");
	}
	
	public MyDrivers(String drivers){
		System.out.println("load drivers  "+drivers);
	}
	
	public MyDrivers(int count){
		System.out.println("load drivers  "+count);
	}

	public void display(){
		System.out.println("i am in display");
	}
}
