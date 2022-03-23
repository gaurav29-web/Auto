package javaQuestions;

public class MultiplyFiveTable {

	public static void main(String[] args) {
		int result = multiply(5,10);

	}
	public static int multiply(int a, int b){
		int mul = 0;
		for(int i=1;i<=b;i++){
			mul = mul+a;
			System.out.println(mul);
					}
		return mul;
		
	}

}
