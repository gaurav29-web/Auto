package com.Conditions;

public class SwitchDemo {

	public static void main(String[] args) {
		int i = 35;
		switch(i){
		case 20:
			System.out.println("Value of I is 20");
			break;
		case 35:
			System.out.println("Value of I is 35");
			break;		
		default:
			System.out.println("Default value");
			break;
	}
		
		//With out break-- Performance will be low as after matching also it will run all cases
		int j = 20;
		switch(j){
		case 20:
			System.out.println("Value of J is 20");
		case 35:
			System.out.println("Value of J is 35");
		default:
			System.out.println("Default value");
	}	
	}
}
