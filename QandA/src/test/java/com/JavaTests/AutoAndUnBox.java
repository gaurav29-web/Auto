package com.JavaTests;

public class AutoAndUnBox {

	public static void main(String[] args) {
		int i=10;
		Integer j = 9;
		//Autoboxing-- primitive to object
		Integer k = Integer.valueOf(i);
		
		//unboxing-- Object to primitime
		int l= j.intValue();
		
		//String.valueOf(i); convert int to string   
		//Integer.parseInt(s);//convert string to int

	}

}
