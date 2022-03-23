package com.JavaTests;

public class StaticBlock {
	static int i,j;
	static{
		i=-1;
		j=11;
	}
	public static void main(String[] args) {
		if(i<=0 || j<=0){
			System.out.println("Invalid size");
		}
		else
		System.out.println("HolloGram size is "+i*j);

	}

}
