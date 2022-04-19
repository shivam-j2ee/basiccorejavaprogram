package com.raystech.StrinG;

public class Test15 {

	public static void main(String[] args) {

		
		String s = new String("Hukum123Pal");
		int a=0,b=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isLetter(c)){
				a++;
				System.out.print(c);
			}else if(Character.isDigit(c)){
				b++;
				System.out.println();
				System.out.print(c);
			}
		}
		System.out.println("\nTotal Characters are --> " + a);
		System.out.println("Total Digits are --> " + b);
	}

}
