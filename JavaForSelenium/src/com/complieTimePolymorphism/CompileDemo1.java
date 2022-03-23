package com.complieTimePolymorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is compiletime binding since we have already provided parameter values. 
		CompileDemo1 obj1 = new CompileDemo1();
		obj1.add(45, 45);
		//This example is for different number of argument
		obj1.add(10, 10, 15);
		
		//This example is for different type of argument
		obj1.add(10.00, 12.00);
		
		//different order
		obj1.add(10.00, 10);
		obj1.add(10, 20.00);
		}

	public void add(int a, int b){
		int c = a+b;
		System.out.println("Sum of two num = "+c);
	}
	
	//different number of argurments
	public void add(int a, int b, int c){
		int d = a+b+c;
		System.out.println("Sum of three num = "+d);
	}
	
	//Different types of argument
	public void add(double a, double b){
		double c = a+b;
		System.out.println("Sum of two double num = "+c);
	}
		
		//Different Order of argument
		public void add(double a, int b){
			double c = a+b;
			System.out.println("Sum of two double and int num = "+c);
}
		
		//Different Order of argument
				public void add(int a, double b){
					double c = a+b;
					System.out.println("Sum of two int and double num = "+c);
		}
}