package com.raystech.Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {

		//Map m = new Hashtable<>();
		Hashtable h = new Hashtable<>();
		h.put("One", "1");
		h.put("Two", "2");
		h.put("2", "Two");
		h.put("null", "Three");
		h.put("Three", "null");
		h.put("null", "null");
		
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.get("null"));
		
		
	}

}
