package com.raystech.StrinG;

public class Test1 {

	public static void main(String[] args) {
		
		String s = new String("HukumPal");
		
		//char[] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--){
			
			char ch = s.charAt(i);
			System.out.print(ch);
			
		}
				
	}
	
}
