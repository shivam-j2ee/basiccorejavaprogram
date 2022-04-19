package com.raystech.StrinG;

public class M1 {

	public static void main(String[] args) {

		String s = new String("vipul");
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)){
			System.out.println("String is Palingdrom");
		}else {
			System.out.println("String is not Palingdrom");
		}
		
	}

}
