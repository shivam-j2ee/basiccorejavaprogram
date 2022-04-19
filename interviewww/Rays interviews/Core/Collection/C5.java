package com.raystech.Collection;

import java.util.Stack;

public class C5 {

	public static void main(String[] args) {

		
		Stack s = new Stack<>();
		s.push(1);
		s.push(null);
		s.push(2);
		s.push(3);
		s.push(null);
		s.push(4);
		s.push(5);
		s.push(2);
		
		System.out.println(s);
		
		Stack s1 = new Stack<>();
		int a = s.size();
		System.out.println(a);
		
		for(int i=1;i<=a;i++){
			
			s1.push(s.pop());
			
		}System.out.println(s1);
		
	}

}
