package com.raystech.StrinG;

public class UseReplaceAndReplaceAllMethod {

	public static void main(String[] args) {

		String s = new String("hudfj67u8%#u");
	  //s = s.replace("u", "m"); //try this also but result is same	
		s = s.replace('u', 'm');
	//	System.out.println(s);
		
		s = s.replaceAll("[a-z]", "A");
		//System.out.println(s);

		
		StringBuffer sb = new StringBuffer("jfdj443jhf");
		sb = sb.replace(6, 7, "K");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	
	
	
	 String st = "Hukum432Pal$^*(#";
	    //System.out.println(st.replace("u", "p")); //try this also but result is same
	 System.out.println(st.replace('u', 'p'));
	 
	}

}
