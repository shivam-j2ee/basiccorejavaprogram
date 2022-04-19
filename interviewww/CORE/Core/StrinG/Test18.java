package com.raystech.StrinG;

public class Test18 {

	public static void main(String[] args) {

		String s = new String("nitin");
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--){
			rev = rev+s.charAt(i);
		}System.out.println("Reverse String is " + rev);
		if(s.equals(rev)){
			System.out.println("String is Palingdrom");
			
		}else{
			System.out.println("Not Palingdrom");
		}
		
	}

}
