package com.raystech.StrinG;

import java.util.Scanner;

public class M4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		int count = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
			if (c == 'a') {
				a++;
			}
			if (c == 'e') {
				e++;
			}
			if (c == 'i') {
				i++;
			}
			if (c == 'o') {
				o++;
			}
			if (c == 'u') {
				u++;
			}

		}
		
		
		if (count != 0) {
			System.out.println("Total vowels are " + count);
		}

		if (a != 0) {
			System.out.println("a occurs " + a + "times");
		}
		if (e != 0) {
			System.out.println("e occurs " + e + "times");
		}
		if (i != 0) {
			System.out.println("i occurs " + i + "times");
		}
		if (o != 0) {
			System.out.println("o occurs " + o + "times");
		}
		if (u != 0) {
			System.out.println("u occurs " + u + "times");
		}

	}

}