package javaQuestions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x= 8;
		System.out.println(++x *3+""+x);*/
		Test t = new Test();
		t.Rev();
	}

	
	public void Rev(){
		String s= "Gaurav";
		//char[] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
}
