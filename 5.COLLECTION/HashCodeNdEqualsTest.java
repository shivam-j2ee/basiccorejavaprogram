package com.raystech.Collection;

public class HashCodeNdEqualsTest {

	public static void main(String[] args) {

		HashCodeNdEquals h = new HashCodeNdEquals("Hukum Pal", 24);
		HashCodeNdEquals h1 = new HashCodeNdEquals("Harish Pal", 30);
		
		System.out.println(h.equals(h1));
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		
		
	}

}
