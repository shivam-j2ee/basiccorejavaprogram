package com.raystech.Collection;

public class C4Test {

	public static void main(String[] args) {

		C4 c = new C4("Nilesh Singh ", 20);
		C4 c1 = new C4("Ankit Singh ", 30);
		
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
	}

}
