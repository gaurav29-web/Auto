package javaQuestions;

public class MinMaxNumberInArray {

	public static void main(String[] args) {
		int[][] abc = {{1,2,3},{3,2,5},{9,8,10}};
		int min = 0 ;
		int max = 0;
		//min = abc[0][0]; //by default assigned one value otherwise always 0 will be assigned
		min = Integer.MAX_VALUE;// Assigned max value and compare with lower values
		max = Integer.MIN_VALUE;// Assigned min value and compare with higher values
		
		for(int i=0;i<abc.length;i++){
			for(int j=0;j<abc[0].length;j++){
				if(abc[i][j]<min){
					min = abc[i][j];
				}
				else if(abc[i][j]>max){
					max= abc[i][j];
				}
			}
		}
		System.out.println("Min is = "+min);
		System.out.println("Max is = "+max);
	}

}
