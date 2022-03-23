package com.Parameters;

public class ParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Passing parameters
		ParametersDemo objParam = new ParametersDemo();
		objParam.sum(10, 20);
		
		//get sub with return value
		int subVal = objParam.sub(20, 10);
		System.out.println("Sub is ==="+subVal);
		
		
		//Dyanamic calculator with non static method and return type
		DynamicCalculator objDynCal = new DynamicCalculator();
		double dynVal = objDynCal.subDouble(20.00, 5.88);
		
		System.out.println("Sub double is ==="+dynVal);
		
		//Dyanamic calculator with static method and return type
				double staticMethVal = DynamicCalculator.sumDouble(10.00, 5.55);
				
				System.out.println("Sum double is ==="+staticMethVal);
		
	}
	
	//Sum for passing parameters
	public void sum(int a, int b){
		int c = a+b;
		System.out.println("Sum is ==="+c);
		}

	
	//Sub with return type
	public int sub(int a, int b){
		int c = a-b;
		return c;
		
	}
}
