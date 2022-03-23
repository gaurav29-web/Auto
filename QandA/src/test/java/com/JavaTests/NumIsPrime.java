package com.JavaTests;

public class NumIsPrime {

	public static void main(String[] args) {
		NumIsPrime np = new NumIsPrime();
		np.Prime();

	}

	public void Prime(){
		 int num = 23;
		 String a;
		 a = (num%2==0) ?  "Number is prime" :  "Number is not prime";
		System.out.println(a);
	}
}
