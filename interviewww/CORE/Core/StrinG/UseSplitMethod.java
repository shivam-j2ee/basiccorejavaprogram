package com.raystech.StrinG;

public class UseSplitMethod {

	public static void main(String[] args) {

		String s = new String("Java is object oriented programming");
		
		String[] v = s.split("[a-d]");
		for(String s1 : v)
			System.out.print(s1);
	}

}
