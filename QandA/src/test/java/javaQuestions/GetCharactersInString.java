package javaQuestions;

import java.util.ArrayList;

public class GetCharactersInString {

	public static void main(String[] args) {
		String name= "gaurav singh";
		name = name.replace(" ", "");
		ArrayList<Character> ar = new ArrayList<Character>();
		for(int i=0;i<name.length();i++){
			int t = 0;
			if(!ar.contains(name.charAt(i))){
				ar.add(name.charAt(i));
				for(int j=i;j<name.length();j++){
					if(name.charAt(i)==name.charAt(j))
						t++;
				}
				System.out.println("Character " +name.charAt(i) + " is repeated times " +t);
			}
			System.out.println("----------------------------------------------------------------");
		}
	}
}


