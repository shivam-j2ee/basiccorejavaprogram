package com.raystech.StrinG;

import java.util.Scanner;

public class M10 {

	public static void main(String[] args) {

		
		/*String s = new String("AHukumPal");
		 s = s.toLowerCase();
		char[] c = s.toCharArray();
		//String r=null;
		for(int i=0;i<s.length();i++){
		  for(int j=i+1;j<s.length();j++){
			  if(c[i]==c[j]){
				 //r = String.valueOf(c[i]);
				 //System.out.println(r);
				 //r =r.replace("c[i]","");
				  System.out.println(c[i]);
			  }
		  }//System.out.println(s);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a character from given string "+ s);
		char c = sc.next().toLowerCase().charAt(0);
		
		int n=0;
		for(int i=0;i<s.length();i++){
			
			//c = s.charAt(i);
			if(c==s.charAt(i)){
				n=n+1;
				
			}
		}System.out.println(c+ " occur " +n+" times in given string " +s);
						
	}
}
