package com.raystech.Collection;

public class HashcodeAndEqualsMethodTest {

	public static void main(String[] args) {

		HashcodeAndEqualsMethod h = new HashcodeAndEqualsMethod("HukumPal", 24);
		HashcodeAndEqualsMethod h1 = new HashcodeAndEqualsMethod("Nilesh Singh", 30);
		
		System.out.println(h.equals(h1));
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode()
				);
	}

}
