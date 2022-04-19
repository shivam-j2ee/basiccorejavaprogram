package com.raystech.StrinG;

public class M5 {

	public static void main(String[] args) {

		String s = new String("DakshPalAl");
		    s = s.toLowerCase();
		    int count=0;
		    char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++){
		     
			for(int j=i+1;j<s.length();j++){
			if(c[i]==c[j]){
			count = count+1;
		System.out.println("Duplicate Characters are --> (" + c[i] + ") occur " + count + " times in given string " + s);	
			}
	
			}
		
		}
		
	}

}
