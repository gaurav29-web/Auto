package javaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.select.Collector;

public class ReverseStringAndDistinctVal {

	public static void main(String[] args) {
		String s= "Gaurav Singh";
		char[] arr = s.toCharArray();
		for(int i= arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		System.out.println();
		
		//Distinct 
		char[] arr2 = s.toCharArray();
		List<Character> ch = new ArrayList<Character>();
		for(char c: arr2){
			ch.add(c);
		}
		ch.stream().distinct().forEach(System.out::print);
		List<Character> vv= ch.stream().distinct().collect(Collectors.toList());
		
		//Palindrom string-- Same after reverse 
		String s1= "madam";
		char[] arr1 = s1.toCharArray();
		String t="";
		for(int i= arr1.length-1;i>=0;i--){
			t= t+arr1[i];
		}
		if(t.equalsIgnoreCase(s1)){
			System.out.println("String is palindrom");
		}
	}

}
