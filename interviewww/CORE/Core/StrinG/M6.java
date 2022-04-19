package com.raystech.StrinG;

public class M6 {

	public static void main(String[] args) {

		String s = new String("HukumPal");
		int n = s.length()-s.replace("K", "").length();
		System.out.println("H occur "+n+" times");
		
	}

}
