package com.raystech.StrinG;

public class UseReplaceAllMethod {

	public static void main(String[] args) {

		String s = new String("JaVajhgjrhgfrHJGJHGFGrg");
		
		/*for(int i=0;i<s.length();i++){
			
			char[] c = s.toCharArray();
			if(s.charAt(i)>=97 && s.charAt(i)<=122){
				char c = s.charAt(i); 
				
			}
			
		}*/

	  s = s.replaceAll("[a-z]", "@");
	System.out.println(s);
	}

}
