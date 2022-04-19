package com.raystech.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapOrMap {

	public static void main(String[] args) {

		Map m = new HashMap<>();
		m.put("1", "One");
		m.put("2", "Two");
		m.put("null", "null");
		m.put("zero", "null");
		m.put("null", "Eight");
	    m.put("null", "Ten");
	    m.put("null", "Seven");
		m.put("null", "Nine");
		m.put("null", "Eight");
		//m.put("null", "null");
		m.put("3", "3");
		//m.put("null", "Nine");
		//m.put("null", "Eight");
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		
		
	}

}
