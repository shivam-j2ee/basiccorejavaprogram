package com.raystech.Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		//LinkedHashMap allow one null key and one null value
		LinkedHashMap h = new LinkedHashMap<>();
		h.put("1", "One");
		h.put("2", "Two");
		h.put("null", "null");
		h.put("zero", "null");
		h.put("null", "Eight");
	    h.put("null", "Ten");
	    h.put("null", "Seven");
		h.put("null", "Nine");
		h.put("null", "Eight");
		//h.put("null", "null");
		h.put("3", "3");
		
		
		System.out.println(h);
		System.out.println(h.get("null"));
		
		
	}

}
