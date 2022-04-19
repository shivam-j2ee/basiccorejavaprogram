package com.raystech.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		//Map m = new TreeMap<>();
		  TreeMap t = new TreeMap<>();
		  t.put("1", "One");
		  t.put("2", "Two");
		  t.put("null", "null");
		  t.put("2", "Three");
		  t.put("4", "null");
		  t.put("7", "One");
		  t.put("null", "Five");
		  t.put("5", "Five");
		
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.values());
		System.out.println(t.entrySet());
		
		
	}

}
