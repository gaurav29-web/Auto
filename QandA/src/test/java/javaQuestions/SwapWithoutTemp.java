package javaQuestions;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a= 3;
		int b = 6;
		a = a+b; //9
		b = a-b; //3
		a = a-b;
		
		System.out.println("A is " + a + " B is " + b);

	}

}
