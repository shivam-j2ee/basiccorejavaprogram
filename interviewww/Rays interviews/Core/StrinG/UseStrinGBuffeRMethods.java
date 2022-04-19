package com.raystech.StrinG;

import java.util.stream.IntStream;

public class UseStrinGBuffeRMethods {

	public static void main(String[] args) {
  
		//There are 4 example of EnsureCapacity() Method
	
		// 1st Example
	   // The ensure capacity can't be less than the old capacity
		/*
		StringBuffer s = new StringBuffer("vipulbaser");
		System.out.println(s.capacity());
		s.ensureCapacity(26);
		
		//Now In this case,The ensure capacity is twice the old capacity plus 2
		System.out.println(s.capacity());
		*/
		// 2nd Example
		//When ensure capacity is more than the default 16, the ensure capacity will be same that is pass
		/*StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(44);
		System.out.println(sb.capacity());
		*/
		// 3rd Example
		// When we passed the negative capacity value than doesn't have any effect to it and just return the old existing value

		/*StringBuffer st = new StringBuffer();
		System.out.println(st.capacity());
		st.ensureCapacity(-30);
		System.out.println(st.capacity());
		*/
	   // 4th Example
		/*StringBuffer sr = new StringBuffer();
		System.out.println(sr.capacity());
		//sr = sr.append("Pal");
		sr.ensureCapacity(18);
		System.out.println(sr.capacity());
		*/
		
		// 5th Example
		StringBuffer str = new StringBuffer("vipulbaser");
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.charAt(2));
		System.out.println(str.hashCode());
		IntStream c = str.chars();
		System.out.println(c);
		System.out.println(str.getClass());
		System.out.println(str.insert(6, 'P'));
		System.out.println(str.insert(5, "Daksh"));
		System.out.println(str.delete(2, 4));		
		System.out.println(str.deleteCharAt(5));

	}

}
