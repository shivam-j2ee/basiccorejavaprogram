package com.raystech.StrinG;

public class Test17 {

	public static void main(String[] args) {

		String s = new String("Hukum Pal");
		s =s+"pal";
		s=s.intern();
		
		System.out.println(s);
		
		
		
	}

}
