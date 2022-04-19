package com.raystech.StrinG;

public class ConvertStringToChar {

	public static void main(String[] args) {
		
		String s = new String("vipul");
		
		for(int i=0;i<s.length();i++){
			
			char c =s.charAt(i);
			System.out.println("Convert String to Char=" +i + "-->" +c);
			
		}
		
		System.out.println(s.length());
	}
	
}