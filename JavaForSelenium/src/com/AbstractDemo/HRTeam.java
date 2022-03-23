package com.AbstractDemo;

public class HRTeam extends ITDept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Child class object can call parent methods and child as well
		HRTeam hr = new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
	}

	@Override
	public void salary() {
		System.out.println("Salary is 5 lacs per annum");
		
	}

}
