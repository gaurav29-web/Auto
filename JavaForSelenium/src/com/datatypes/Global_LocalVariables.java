package com.datatypes;

public class Global_LocalVariables {

	static int b;   //does not throws any error and will return 0 always for int. For others will return null. Global
	public static void main(String[] args){
	int a=80; //without initiallization will always throw error as it stores garbage value without initialization //Local
	
	System.out.println(a);
	System.out.println(b);
	
	}
}
