package com.raystech.StrinG;

public class ConvertStringToUpperCase {

	public static void main(String[] args) {

		String s = new String("HukumPaL");
		
		for(int i=0;i<s.length();i++){
			
			int n = s.charAt(i);
			if(n>96 && n<123){
				
				n = n-32;
				System.out.print((char)n);
			}else{
				System.out.print((char)n);
			}
			
		}
	}

}
