package javaQuestions;

import org.testng.annotations.Test;

public class SumOfElementsinArray {
	int sum=0;
	@Test
	public void SumElements(){
		int[] a = {1,2,4,5};
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
