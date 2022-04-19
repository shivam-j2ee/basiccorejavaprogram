package com.raystech.Collection;

import java.util.Stack;

public class StackPushAndPopMethod {

	public static void main(String[] args) {

		Stack s = new Stack<>();
		Stack s1 = new Stack<>();
		
		for(char c='A';c<='Z';c++){
			s.push(c);
		} System.out.print(s+" ");
		
		int a = s.size();
		System.out.println(a);
		for(int i=1;i<=a;i++){
			
			s1.push(s.pop());			
		}System.out.print(s1+" ");
		System.out.println(s1.capacity());
		System.out.println(s1.peek());
		System.out.println(s1.search('Q'));
		
		//Stack s2 = new Stack<>();
		for(int i=1;i<=26;i++){
			
			System.out.print(s1.pop()+" ");
		}
	}

}
