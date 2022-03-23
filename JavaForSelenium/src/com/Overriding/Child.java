package com.Overriding;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1 = new Child();
		
		//child class
		obj1.display();
		obj1.display("abc");
		
		//Parent method
		Parent obj2 = new Parent();
		obj2.display();
		
		
		//Will call child method only. Overrides parent data
		Parent obj3 = new Child();
		obj3.display();
	}
	
	void displayNew(){
		System.out.println("Display New");
	}
	
	//Overriding method from parent class
	void display(){
		System.out.println("Display in child class");
	}
	
	//No over riding since signature is changes
	void display(String test){
		System.out.println("Display in child class with param  "+test);
	}

}
