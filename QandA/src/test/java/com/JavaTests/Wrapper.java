package com.JavaTests;

public class Wrapper {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);
		i.intValue();
		System.out.println(i);
		String b = i.toString();
		System.out.println(i);
		
		int ii=11;
		Integer.valueOf(ii);
		System.out.println(ii);
		String a = String.valueOf(ii);
		System.out.println(a);

	}

}
