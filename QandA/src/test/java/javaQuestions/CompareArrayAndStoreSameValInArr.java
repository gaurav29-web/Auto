package javaQuestions;

import java.util.ArrayList;

public class CompareArrayAndStoreSameValInArr {
	public static void main(String[] args) {
		int[] a = {1,2,4,5};
		int[] b = {1,2,5,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i<a.length;i++){
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		Object[] c = al.toArray();
		for(Object j:c){
			System.out.println(j);
		}
		
	}
}
