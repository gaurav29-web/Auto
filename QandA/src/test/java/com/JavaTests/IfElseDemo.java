package com.JavaTests;

public class IfElseDemo {
	/*
	 * Task
Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
	 */

	public static void main(String[] args) {
		int n = 4;
		if(!(n%2==0)){
			System.out.println("Weired");
		}
		else if((n%2==0) &&(n>=2 && n<=5)){
			System.out.println("Not Weired");
		}
		else if((n%2==0) &&(n>=6 && n<=20)){
			System.out.println("Weired");
		}
		else if((n%2==0) &&(n>20)){
			System.out.println("Not Weired");
		}
	}

}
