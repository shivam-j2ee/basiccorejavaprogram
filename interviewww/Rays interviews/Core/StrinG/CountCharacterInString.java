package com.raystech.StrinG;

import java.util.Scanner;

public class CountCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a character to given string --> " + s);

		char c = sc.next().toLowerCase().charAt(0);
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(c + " occurs " + count + " times in " + s);
		sc.close();
	}

}
