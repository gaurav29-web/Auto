package com.stringClass;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Starts and ends with
		String a= "Selenium Demo";
		if(a.startsWith("Selenium")){
			System.out.println("String starts with selenium");
		}
		else if(a.endsWith("Demo1")){
			System.out.println("String ends with Demo");
		}
		
		//Compare
		if(a.equals("Selenium Demo")){
			System.out.println("String equals");
		}
		
		//Compare with ignore case
				if(a.equalsIgnoreCase("selenium Demo")){
					System.out.println("String equals");
				}
		
		//Split string
		String arr[] = a.split(" ");
		for(int i = 0;i< arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//Trim
		String b = "abc     ";
		System.out.println(b.trim());
		
		//Char at
				String c = "abc     ";
				System.out.println(b.trim().charAt(1));
	}

}
