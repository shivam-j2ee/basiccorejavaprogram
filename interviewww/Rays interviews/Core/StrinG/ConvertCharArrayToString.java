package com.raystech.StrinG;

public class ConvertCharArrayToString {

	public static void main(String[] args) {

		/*char[] c = {'V','i','p','u','l'};
		String s = null;
		//s = s.valueOf(c);
		s = String.valueOf(c);
		 System.out.println(s);*/
		
		char[] c = new char[] {'V','i','p','u','l'};
		
		String s = new String(c);
		 
		System.out.println(s);
		
	}

}
