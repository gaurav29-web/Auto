package com.JavaTests;

public class DiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffInArray obj = new DiffInArray();
		obj.Mul5Table();
	}

	public void DiffInElements(){
		int a[]={20,2,1,4,6,10};
		int t=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i+1]-a[i]>t){
				t=a[i+1]-a[i];
			}
		}
		System.out.println("Max diff is = "+t);
	}
	
	public void MinMax(){
		int b[]= {1,3,5,2,8};
		int max =0;
		int min =2;
		for(int i=0;i<b.length;i++){
			if(b[i]>max){
				max=b[i];}
				else if(b[i]<min){
					min = b[i];
				}
			}
		System.out.println(max +"==========="+min);
		}
	
	public void Mul5Table(){
		int a=5;
		int b=10;
		int mul=0;
		for(int i=1;i<=b;i++){
			mul = mul+a;
			System.out.println(mul);
		}
	}
	}

