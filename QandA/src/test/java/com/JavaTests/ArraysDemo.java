package com.JavaTests;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,4};
		int b[] = new int[2];
		System.arraycopy(a, 0, b, 0, 2);
		System.out.println(Arrays.toString(b));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int c[] = new int[5];
		Arrays.fill(c, 8);
		
		int d[] = new int[5];
		Arrays.fill(d, 8);
		
		System.out.println(Arrays.equals(d, c));
		System.out.println(Arrays.toString(c));
	}

}
