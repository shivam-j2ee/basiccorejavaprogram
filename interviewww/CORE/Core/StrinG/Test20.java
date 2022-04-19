package com.raystech.StrinG;

public class Test20 {

	public static void main(String[] args) {

		String s = new String("pal hukum");
		
		String[] w = s.split("\\s");
		String c = "";
		for(String n:w){
		System.out.println(n);
		String a = n.substring(0,1);
		String b = n.substring(1);
		 c = c+a.toUpperCase()+b+"";
		System.out.println(c);
		 
		}
		System.out.println(c);
	}

}
