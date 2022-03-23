package com.InterfaceDemo;

public class AdvancedCalculatorDemo implements CalculatorDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scenario 1- create child class reference and child class object- Then we can access all methods in child and parent class
		AdvancedCalculatorDemo obj1 = new AdvancedCalculatorDemo();
		obj1.add();
		obj1.sub();
		obj1.mul();
		
		
		//Scenario 2- create base class reference and child class object- Then we can access all methods in parent 
		CalculatorDemo obj2 = new AdvancedCalculatorDemo();
				obj2.add();
				obj2.sub();
				
		//You can not create object of an interface as it has abstract methods(no definition)
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x+10);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(x-2);
	}
	
	public void mul(){
		System.out.println(x*2);
	}
}
