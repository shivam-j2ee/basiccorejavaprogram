package com.raystech.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {

		Map m = new HashMap();
		
		m.put("null", "One");
		m.put("2", "Two");
		m.put("3", "Three");
		m.put("null", "Four");
		//m.put("4", "Four");
		
		System.out.println(m);
		
	}

}
