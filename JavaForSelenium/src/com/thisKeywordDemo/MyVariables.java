package com.thisKeywordDemo;

public class MyVariables {
	
	int x;
	int y;
	
	public MyVariables(int x, int y){
		//assiged local values to global variable
		this.x = x;
		this.y = y;
		
		// you will get answer as zero since value of global variables will be 0
		/*x=x;
		y=y;*/
		
	}
	
	public void sum(){
		int sum = x+y;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVariables obj1 = new MyVariables(10, 5);
		obj1.sum();
	}

}
