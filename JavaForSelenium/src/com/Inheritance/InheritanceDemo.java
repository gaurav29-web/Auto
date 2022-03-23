package com.Inheritance;

public class InheritanceDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using inheritance all objects can be called without creating object of base class
		InheritanceDemo obj1 = new InheritanceDemo();
		obj1.add();
		obj1.sub();
		obj1.mul();
		
		//Use only baseclass methods 
		BaseClass obj2 = new BaseClass();
		obj2.add();
		obj2.sub();
		
		
		//Reference of baseclass and object of child class. You can not call child class methods
		BaseClass obj3 = new InheritanceDemo();
		obj3.add();
		obj3.sub();
		
		//Reference of Child and object of Base class. Not possible as child can not hold parent
	
	}
	
	public void mul(){
		System.out.println("Mul two numbers");
	}
	public void sub(){
		System.out.println("Sub two numbers child");
	}

}
