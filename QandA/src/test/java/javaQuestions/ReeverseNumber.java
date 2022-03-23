package javaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReeverseNumber {

	public static void main(String[] args) {
		int a =543;
		int reverse = 0;
		while(a!=0){
			int digit = a%10;
			reverse = digit +reverse*10;
			a=a/10;
		}
		System.out.println(reverse);
	}
}
