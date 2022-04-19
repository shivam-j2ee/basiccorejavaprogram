package com.raystech.IO;

import java.util.StringTokenizer;

public class UseTokenizer {

	public static void main(String[] args) {

		String s = "This is Java,Java is object oriented programming language,and more robust";
		
		StringTokenizer st = new StringTokenizer(s, " ");
		String token = null;
		while(st.hasMoreElements()){
			token = st.nextToken();
			System.out.println("Token is : " + token);
			
		}
		
		
	}

}
