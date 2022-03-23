package com.SuperKeywordDemo;

public class subclassConst extends ParentClassConst {

	public static void main(String[] args) {
		subclassConst obj1 = new subclassConst();
		subclassConst obj2 = new subclassConst("Gaurav");

	}

	public subclassConst(){
		System.out.println("In child class constructor");
	}
	
	public subclassConst(String name){
		//Used super keyword to call parameterized parent constructor otherwise always default parent constrctor will be called
		super(name);
		
		//super(name); --it will throw error since super can not be used in second line
		System.out.println("In child class constructor " +name);
	}
	
}
