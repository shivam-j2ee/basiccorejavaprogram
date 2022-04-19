package com.raystech.StrinG;

public class CountVowelInString {

	public static void main(String[] args) {

		
		String s = new String("vipul");
	    s = s.toLowerCase();
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			
			//String str = s.substring(i,i+1);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				
				System.out.println("Number of vowel is --> " +c);
			}
		}
		//System.out.println();
		//System.out.println("Total vowels are --> " + count);
	}

}
