package com.JavaTests;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		switch (a){
		case "MON":
			System.out.println("Monday");
			break;
		case "TUES":
			System.out.println("Tuesday");
			break;
		case "WED" :
			System.out.println("Wednusday");
		case "Thursday":
			System.out.println("Thursday");
		case "Friday":
			System.out.println("Friday");
		case "Saturday":
			System.out.println("Saturday");
		default: 
			System.out.println("Not a valid day");
			break;
		}
		
		//Cal
		int aa = scan.nextInt();
		int b = scan .nextInt();
		char op = scan.next().charAt(0);
		
		switch(op){
		case '+':
			System.out.println(aa+b);
			break;
		case '-':
			System.out.println(aa-b);
			break;
		}
		
	}
}
