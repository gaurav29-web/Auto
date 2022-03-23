package javaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		Integer[] a = {1,2,4,5,3,2};
		List<Integer> al = Arrays.asList(a);
		Collections.sort(al);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		//Without collections
		int[] b = {1,2,4,5,3,2};
		int temp;
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]>b[j]){
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
