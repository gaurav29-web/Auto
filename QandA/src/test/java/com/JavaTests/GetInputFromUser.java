package com.JavaTests;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int temp;
		System.out.println("Sum is = "+(a+b)); //has no compile time error but instead of sum it is appended hence bracket needed
		System.out.println("Sub is = "+(a-b)); //without bracket has compile time error as - is no operator in string
		System.out.println("Diff is = "+a/b);
		System.out.println("Mul is = "+a*b);
		
		//which is greater
		temp = a;
		if(temp<b){
			temp=b;			
		}
		else if(c>temp) temp=c;
		
		System.out.println(temp);
	}
}
