package com.raystech.StrinG;

public class M9 {

	public static void main(String[] args) {

		String s = new String("HukumPaL");
		
		for(int i=0;i<s.length();i++){
			
			int c = s.charAt(i);
			/*if(c>=65 && c<=90){
				c = c+32;
				System.out.print((char)c);
			}else{
				System.out.print((char)c);
			}*/
			
			if(c>=95 && c<=122){
				c = c-32;
				System.out.print((char)c);
			}else{
				System.out.print((char)c);
			}
		}
		
	}

}
