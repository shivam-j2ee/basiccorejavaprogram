package com.raystech.StrinG;

public class M8 {

	public static void main(String[] args) {

		//Delete a character from String using StringBuffer
		
		StringBuffer s = new StringBuffer("HukumpAl");
		s.delete(5,6);
		System.out.println(s);
		
		/*String s = new String("vipul");
		//s = s.replace("u", "a");
		s = s.replaceAll("[a-t]", " ");
		 System.out.println(s);*/
		/* 
		 String st = new String("HukumPAl");
		  st = st.toLowerCase();
		  st = st.replaceAll("[aeiou]", "");
		  System.out.println(st);*/
		
	}

}
