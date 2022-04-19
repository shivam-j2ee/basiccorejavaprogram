package com.raystech.StrinG;

public class Test6 {

	public static void main(String[] args) {

		String s = new String("AefhjIkgju");
		s = s.toLowerCase();
		int total=0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				total = total+1;
				System.out.print(ch);
			}
		}System.out.println("\nTotal vowels are --> " + total);
		
	}

}
