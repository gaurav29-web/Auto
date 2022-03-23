package com.SuperKeywordDemo;

public class childClass extends baseClass{
	int rate = 10;
	public static void main(String[] args) {
		childClass obj1 = new childClass();
		System.out.println(obj1.rate);
		obj1.showRatePrivateBank();
	}
	public void showRatePrivateBank(){
		System.out.println("Show me private bank rate "+rate);
		
		//called base class variable which has same name as in child class
		System.out.println("Show me private bank rate "+super.rate);
		showRate();
		
		//calls method from base class with super keyword
		super.showRate();
	}
	
	public void showRate(){
		System.out.println("Show me RBI rate in child class "+rate);
	}
}
