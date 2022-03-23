package javaQuestions;

public class StringImmutable {

	public static void main(String[] args) {
		String a="Hello";
		a.concat("World");
		System.out.println(a); //hello-- String does not change without assigning it since it is immutable
		a= a.concat("World");
		System.out.println(a); //helloWorld -- Since manually changed a to new string
		
		//String buffer
		StringBuffer ab=new StringBuffer("Hello");
		ab.append("World");
		System.out.println(ab);  //HelloWorld. String is changed
		
		ab.insert(2, "She");
		System.out.println(ab); //HeShelloWorld
		
		ab.replace(5, 7, "aa");  //Start from 5 and upto 7 means 5 and 6 only
		System.out.println(ab); //HeSheaaoWorld
		
		ab.delete(5, 7);  //Delete from 5 and upto 7 means 5 and 6 only
		System.out.println(ab); //HeSheoWorld
		
		ab.reverse(); 
		System.out.println(ab);
		
	}

}
