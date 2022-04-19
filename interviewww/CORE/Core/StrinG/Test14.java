package com.raystech.StrinG;

public class Test14 {

	public static void main(String[] args) {

		String s = new String("       Hukum Pal      ");
		s = s.trim();
		int n =s.length();
		System.out.println(s.trim());
		System.out.println(n);
		
		String st = new String("Object to relation mapping tool");
		
		String[] sr = st.split("\\s");
		for(String t:sr)
		System.out.println(t);
		
	}

}
