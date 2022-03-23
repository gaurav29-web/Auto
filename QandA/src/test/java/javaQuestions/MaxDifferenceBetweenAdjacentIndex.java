package javaQuestions;

public class MaxDifferenceBetweenAdjacentIndex {

	public static void main(String[] args) {
		int[] a = {1,3,2,10,20};
		int diff=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i+1]-a[i]>diff){
				diff = a[i+1]-a[i];
			}
		}
		System.out.println(diff);
	}

}
