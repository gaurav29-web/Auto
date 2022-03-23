package javaQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckValidIP {
	
	public static void main(String[] args) throws IOException {
		int flag=1;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String ip = read.readLine();
		System.out.println("Input IP is " +ip);
		if(ip.isEmpty()||ip==null) flag =0; 
		if(ip.length()<7||ip.length()>15) flag =0;
		if(ip.startsWith(".")||ip.endsWith(".")) flag = 0;
		//0.0.0.0-255.255.255.255
		String parts[] = ip.split("\\.");
		if(parts.length!=4) flag=0;
		for(int i=0;i<parts.length-1;i++){
			Integer part = Integer.parseInt(parts[i]);
			if(part<0||part>255){
				flag = 0;
			}
		}
		if(flag==0) System.out.println("Invalid IP");
		else System.out.println("Valid IP");
	}

}
