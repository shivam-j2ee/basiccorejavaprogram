package com.raystech.StrinG;

public class ConvertStringToUpperAndLowerCase {

	public static void main(String[] args) {

		String s = new String("AZaz");
		//char[] c = s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			
			int n = s.charAt(i);
			//System.out.println(n);
			if(n>=65 && n<=90){
				n = n+32;
				System.out.print((char)n);
				
			}else if(n>=95 && n<=122){
				n=n-32;
				System.out.print((char)n);
			}
			/*if(n==32){
				System.out.print(" ");
			}*/
			
		}
	
		
		
	}

}
