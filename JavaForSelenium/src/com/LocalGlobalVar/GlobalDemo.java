package com.LocalGlobalVar;

public class GlobalDemo {
static int i =10;
static int j= 12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalDemo.sum();

	}
static void sum(){
	int k = i+j;
	System.out.println(k);
}
}
