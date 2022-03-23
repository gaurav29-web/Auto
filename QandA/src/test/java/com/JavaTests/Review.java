     package com.JavaTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Review {

	public static void main(String[] args) {
		Review r = new Review();
	/*	r.NumPrime();
		r.Prime();
		r.compareArr();
		r.fibonacci();
		r.charsInString();*/
		r.LinkedListDemo();
	}
	public void NumPrime(){
		int n = 23;
		int flag =0;
		int m = n/2;
		if(n==0||n==1){
			System.out.println("Not a prime");
		}
		else{
			for(int i=2;i<=m;i++){
				if(n%i==0){
					System.out.println("Not a prime");
					flag =1;
					break;
				}
			}
		}
		if(flag==0){
			System.out.println(" a prime");
		}
	}

	public void Prime(){
		int num = 11;
		String resp = num%2==0?"even":"Odd";
		System.out.println(resp);
	}
	
	public void compareArr(){
		int a[] = {1,2,3,5};
		int b[] = {1,2,4,3};
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				ar.add(a[i]);
			}
		}
		Object[] o = ar.toArray();
		for(Object k:o){
			System.out.println(k);
		}
	}
	
	public void fibonacci(){
		int a =0;
		int b = 1;
		int sum=0;
		int num =5;
		for(int i=1;i<=num;i++){
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	
	public void charsInString(){
		String s = "gaurav singh";
		ArrayList<Character> ch = new ArrayList<>();
		for(int i= 0;i<s.length();i++)
		{
			int t=0;
			if(!ch.contains(s.charAt(i))){
				ch.add(s.charAt(i));
				for(int j=i;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j)){
						t++;
					}
				}
				System.out.println(s.charAt(i) + "============"+ t);
			}				
			}
		}
	
	public void MinMax(){
		int a[][]= {{2,3,4},
					{3,1,2},
					{7,2,10}};
		int min=0, max=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]<min){
					min = a[i][j];
				}
				else if(a[i][j]>max){
					max = a[i][j];
				}
			}
		}
		System.out.println(min +"and "+ max);
	}
	
	public void Pyramid(){
		int n = 3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public void ReverseString(){
		String ss = "Gaurav singh";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=ss.length()-1;i>=0;i--){
			System.out.print(ss.charAt(i));
			
		}
		for(int j =0;j<ss.length();j++){
			hm.put(ss.charAt(j), j);
		}
		System.out.println(hm.keySet() +"====="+hm.values());
	}
	
	public void distinctUsingLambda(){
		String aa = "gaurav";
		ArrayList<Character> cc = new ArrayList<Character>();
		for(int i=0;i<aa.length();i++){
			cc.add(aa.charAt(i));
		}
		List<Character> vv = cc.stream().distinct().collect(Collectors.toList());
		for(int i=0;i<vv.size();i++){
			System.out.print(vv.get(i));
		}
	}
	
	public void Palindrom(){
		String aa = "madam";
		String t = "";
		for(int i=aa.length()-1;i>=0;i--){
			t= t+aa.charAt(i);
		}
		if(t.equalsIgnoreCase(aa)){
			System.out.println("Same string");
		}
	}
	
	public void SortArray(){
		int[] jj={1,3,9,4};
		ArrayList<Integer> aa = new ArrayList<>();
		for(int i=0;i<jj.length;i++){
			aa.add(jj[i]);
		}
		Collections.sort(aa);
		Object[] o = aa.toArray();
		for(Object k:o){
			System.out.println(k);
		}
	}
	
	public void ListUpdates(){
		List<String> l = new ArrayList<>();
		l.add("Sachin");
		l.add("Rahul");
		l.add("Saurav");
		l.add(1,"Viru");
		l.set(1, "Gaurav");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		List<String> ll = l.subList(1, 3);
		int index= ll.lastIndexOf("Rahul");
		System.out.println(index);
	}
	
	public void LinkedListDemo(){
		LinkedList<String> lls=new LinkedList<>();
		lls.add("Sachin");
		lls.add("Rahul");
		lls.add("Saurav");
		lls.add(1,"Viru");
		Iterator<String> it = lls.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}	
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Sachin");
		al.add("Rahul");
		al.add("Saurav");
		al.add(1,"Viru");
		Iterator<String> it1= al.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}
}
