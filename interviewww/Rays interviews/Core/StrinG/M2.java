package com.raystech.StrinG;

import java.util.Scanner;

public class M2 {

	public static void main(String[] args) {
        // 1st way
		//String s = new String("Hukum Pal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a character in given string " + s);
		char c = sc.next().toLowerCase().charAt(0);
		int total=0;
		for(int i=0;i<s.length();i++){
			if(c==s.charAt(i)){
				total = total+1;
				
			}
		}System.out.println("This Character " + c + " occur " + total + " time in a String");
	
		
	// 2nd way	
	/*String st = new String("HukumPal");
	int n = st.length()-st.replace("u","").length();
	System.out.println("U Character come " + n + " time in a string");*/
	}

}
