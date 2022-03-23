package com.AbstractDemo;

public abstract class ITDept implements Employee{
	
	//Since we are not implementing interface method so we need to make it abstract and so we need to change class as abstract 
	public abstract void salary();

	public void goodies() {
		System.out.println("bottle");
		
	}

	public void work() {
		System.out.println("Developer");
		
	}

}
