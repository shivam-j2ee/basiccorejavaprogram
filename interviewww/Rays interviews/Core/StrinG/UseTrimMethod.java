package com.raystech.StrinG;

public class UseTrimMethod {

	public static void main(String[] args) {

		String s = new String("   Java is    Object Oriented  Programming    ");
		
		System.out.println(s.trim());
		String[] v = s.split("a");
		for(String s1 : v)
		System.out.println(s1);
	}

}
