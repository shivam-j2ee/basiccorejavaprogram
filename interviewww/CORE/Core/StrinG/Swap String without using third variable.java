package com.raystech.StrinG;

public class Test {

	public static void main(String[] args) {
 
		// Swap String without using third variable
	  String a = "Hukum";
	  String b = "Pal";
	  
	   a = a+b;
	   b = a.substring(0,a.length()-b.length());
	   System.out.println(b.length());
	   a = a.substring(b.length());
	   
		System.out.println(a);
		System.out.println(b);
		
		
		//Swap variable using third variable
		String c = "Hukum";
		String d = "Pal";
		
		String e;
		e = c;
		c = d;
		d = e;
		
		System.out.println(c);
		System.out.println(d);
		
	}

}
