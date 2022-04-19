package com.raystech.StrinG;

import java.util.Scanner;

public class M3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a vowel " + s);
		char c = sc.next().toLowerCase().charAt(0);
		int n=0,i;
		for(i=0;i<s.length();i++){
			if(c==s.charAt(i)){
				n = n+1;
			}			
		}
		
		System.out.println("Vowel " + c + " occur " + n + " times in given string");
		
	}

}
