package com.raystech.StrinG;

public class ReverseString {

	public static void main(String[] args) {

		String s = "vipul";
		
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			System.out.print(c);
		}
		
		
	}

}
