package com.raystech.StrinG;

public class Test2 {

	public static void main(String[] args) {

		String s = new String("HukumPal");
		
		System.out.println(s.getClass());
		for(int i=0;i<s.length();i++){
			
			int n = s.charAt(i);
			if(n>=65 && n<=90){
				n = n+32;
				System.out.print((char)n);
			}else {
				System.out.print((char)n);
			}
		}
		
	}

}
