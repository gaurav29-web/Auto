package com.ConstructorDemo;

public class ConsOverloading {
	int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contructor gets initiated as soon as object is created. We are not calling any method still get output
		ConsOverloading obj1 = new ConsOverloading();
		
		ConsOverloading obj2 = new ConsOverloading("Test School");
		
		ConsOverloading obj3 = new ConsOverloading(90);
		obj1.displayResult();
	}
	
	public ConsOverloading(){
		System.out.println("Welcome to school");
	}
	
	//Constructor overloading
	public ConsOverloading(String schoolName){
		System.out.println("Welcome to school == "+schoolName);
	}
	
	//Constructor overloading
		public ConsOverloading(int marks){
			System.out.println("Your marks are == "+marks );
		}
	
	public void displayResult(){
		System.out.println("Marks is 99%");
	}
	
	public void displayResultFromCons(){
		System.out.println("The result is "+result);
	}

}
