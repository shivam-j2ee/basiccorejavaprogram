package com.raystech.StrinG;

public class Test3 {

	public static void main(String[] args) {

		String s = new String("HukumPal");
		
		for(int i=0;i<s.length();i++){
			
			int n = s.charAt(i);
			if(n>=95 && n<=122){
				n = n-32;
				System.out.print((char)n);
			}else{
				System.out.print((char)n); 
				
			}
			
		}
		
	}

}
