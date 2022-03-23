package com.JavaTests;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods.DistinctChars();
	}
	
	public static void compareStrings(){
		String A = "world";
		String B = "hello";
		
	//	For the first line, sum the lengths of A and B.
		//Get length
		int len = A.length()+B.length();
		System.out.println(len);
		
		//For the second line, write Yes if A is lexicographically greater than B otherwise print No instead. ie A comes after B
		if(A.compareTo(B)>0){
			System.out.println("Yes");
		}
		else System.out.println("No");
		
		//For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
		A= A.substring(0, 1).toUpperCase()+A.substring(1, A.length());
		B = B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(A+B);
	}
	
	//Largerst and smallest lexicographically strings of len 3
	public static void SmallAndLargeString(){
		String s = "welcometojava";   //hel, ell, llo, loj, oja, jav, ava
		ArrayList<String> arr = new ArrayList<>();
		String large="a", small="z";
		int len = 3;
		for(int i=0;i<s.length()-2;i++){
			arr.add(s.substring(i,i+3));
		}
		for(int j=0;j<arr.size();j++){
			
			if(small.compareTo(arr.get(j))>0){
				small = arr.get(j);
				
			}
			else if(large.compareTo(arr.get(j))<0){
				large = arr.get(j);
			}
		}
		
		System.out.println(large +" ====  "+small); 
	}
	
	public static void Palindrom(){
		String s = "gaurav";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("Yes");
		}
		else System.out.println("no");
	}
	
	public static void Anagrams(){
		String s1= "silent";
		String s2 = "listena";
		int flag = 0;
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==arr2[i]){
				flag = 1;
			}
			else flag =0;
		}
		if(flag==1) System.out.println("Anagram");
		else  System.out.println("not Anagram");
	}
	
	public static void DistinctChars(){
		String g = "Gaurav Singh";
		ArrayList<Character> c= new ArrayList<>();
		for(int i=0;i<g.length();i++){
			int t=0;
			if(!c.contains(g.charAt(i))){
				c.add(g.charAt(i));
				for(int j=i;j<g.length();j++){
					if(g.charAt(i)==g.charAt(j))
					t++;
				}
				System.out.println(g.charAt(i)+" Is " + t);
			}
		}
	}

}
