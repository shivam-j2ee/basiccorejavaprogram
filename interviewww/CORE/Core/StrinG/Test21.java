package com.raystech.StrinG;

public class Test21 {

	public static void main(String[] args) {

		String s = new String("HukumlPalhU");
		 s = s.toLowerCase();
		
		int count = s.length()-s.replace("h", "").length();
		  System.out.println("u occur " + count + " times in a string");
		
		
	}

}
