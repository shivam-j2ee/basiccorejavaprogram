package com.raystech.StrinG;

public class ConvertStringToLowerCase {

	public static void main(String[] args) {

		String s = new String("AZ");
		
		for(int i=0;i<s.length();i++){
			
			int n = s.charAt(i);
			if(n>64 && n<91){
				
				n = n+32;
				System.out.print((char)n);
			}else{
				System.out.print((char)n);
			}
			
		}
	}


}
