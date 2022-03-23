package com.ConstructorDemo;

public class contsInitializeVal {
	int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contsInitializeVal obj1 = new contsInitializeVal(60);
		obj1.displayResultFromCons();
	}
	
	public contsInitializeVal(int marks){
		result= marks;
	}
	
	public void displayResultFromCons(){
		System.out.println("The result is "+result);
	}

}
