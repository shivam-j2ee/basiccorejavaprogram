package com.raystech.Collection;

import java.util.Stack;

public class StackCopy {

	public static void main(String[] args) {

		Stack s = new Stack<>();
		s.push(1);
		s.push("23");
		s.push(2);
		s.push("Hukum");
		
		System.out.println(s);
		
		Stack s1 = new Stack<>();
		int size = s.size();
		System.out.println(size);
		for(int i=1;i<=size;i++){
			
			s1.push(s.pop());
			
			
		}
		System.out.println(s1);
		System.out.println(s);
	}

}
