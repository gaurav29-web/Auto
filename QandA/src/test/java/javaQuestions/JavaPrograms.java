package javaQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaPrograms {

	public static void main(String[] args) {
		/*JavaPrograms.NumEven();
		JavaPrograms.ValidIP();
		JavaPrograms.ArrayCompare();
		JavaPrograms.Fibbo();
		JavaPrograms.DistinctVals();*/
	//	JavaPrograms.MaxDiff();
		//JavaPrograms.MaxMin();
	//	JavaPrograms.Pyramid();
	//	JavaPrograms.RevNum();
		JavaPrograms.Palindrom();
	//	JavaPrograms.SortArray();
	}
	
	public static void NumEven(){
		int num = 11;
		String val = num%2==0?"even":"odd";
		System.out.println(val);
	}
	//0.0.0.0
	public static void ValidIP(){
		String ip="127.2.2.1";
		int flag = 0;
		if(ip.length()==0 || ip.isEmpty()) flag =0;
		if(ip.length()<7 || ip.length()>15) flag =0;
		if(ip.startsWith(".") || ip.endsWith(".")) flag =0;
		String arr[] = ip.split("\\.");
		for(String a : arr){
			Integer b = Integer.parseInt(a);
			if(b>0 && b<255 && arr.length==4){
				flag = 1;
			}
		}
		if(flag==1) System.out.println("Valid ID");
		else System.out.println("In Valid ID");
	}
	
	//Compare array and store same values
	public static void ArrayCompare(){
		int a[] = {1,2,4,7};
		int b[] = {1,2,7,9};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0;i<a.length;i++){
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		Object[] obj = al.toArray();
		for(Object o:obj){
			System.out.println(o);
		}	
	}

	public static void Fibbo(){
		int a =0;
		int b = 1;
		int sum ;
		for(int i=0;i<6;i++){
			sum = a+b;
			a= b;
			b= sum;
			System.out.println("Fiboo is = "+ sum);
		}
	}
	
	public static void DistinctVals(){
		String a = "Gaurav Singh";
		ArrayList<Character> al = new ArrayList<>();
		for(int i = 0; i<a.length();i++){
			int temp = 0;
			if(!(al.contains(a.charAt(i)))){
				al.add(a.charAt(i));
				for(int j = i; j<a.length();j++){
					if(a.charAt(i)==a.charAt(j))
					temp++;
				}
				System.out.println("Char "+a.charAt(i)+"===="+temp);
			}
		}
	}
	
	public static void MaxDiff(){
		int a[] = {1,3,2,5,10};
		int diff = 0;
		for(int i =0;i<a.length-1;i++){
			if(a[i+1]-a[i]>diff){
				diff = a[i+1]-a[i];
			}
		}
		System.out.println(diff);
	}
	
	public static void MaxMin(){
		int a[] = {2,1,3,5,8};
		int max=0;
		int min =a[0];
		
		for(int i =0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
			else if(a[i]>max){
				max = a[i];
			}
		}
		System.out.println(max+"===="+min);
	}
	
	public static void Pyramid(){
		for(int i=1;i<4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void RevNum(){
		int a = 543;
		int rev =0;
		int dig = 0;
		while(a!=0){
			dig = a%10;
			rev = dig+rev*10;
			a=a/10;
		}
		System.out.println(rev);
	}
	
	public static void Palindrom(){
		String a= "madam";
		String temp = "";
		HashMap<Character, Integer> hp = new HashMap<>();
		for(int i= a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
			temp = temp+a.charAt(i);
			hp.put(a.charAt(i), Integer.valueOf(i));
		}
		if(temp.equals(a))
			System.out.print("Palindrom");
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());
	}
	
	public static void SortArray(){
		int a[]= {1,4,2,7,2};
		int temp;
		for(int i =0;i<a.length;i++){
			for(int j =i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp= a[i];
					a[i]= a[j];
					a[j] =  temp;
				}
				
			}
		}
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	
}

