package com.raystech.StrinG;

public class Test9 {

	public static void main(String[] args) {
      
		 // 1st way
		char[] ch ={'H','u','k','u','m','P','a','l'};
		
		String s;
		s = String.valueOf(ch);
		System.out.println(s);
		
		
		// 2nd way
		char[] c = new char[]{'H','u','k','u','m','P','a','l'};
		
		String st = new String(c);
		System.out.println(st);
	}

}
