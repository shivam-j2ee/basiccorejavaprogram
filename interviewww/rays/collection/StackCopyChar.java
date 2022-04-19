package in.co.rays.collection;

import java.util.Stack;

public class StackCopyChar {
	
	public static void main(String[] args) {
		
	
	char [] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
			'u','v','w','x','y','z'};
	Stack s = new Stack<>();
	
	for(char ch: c){
		s.push(ch);
	}
	Stack s1= new Stack<>();
	
	for (int i = 0; i < c.length; i++) {
		Object obj = s.pop();
		s1.push(obj);
	}
	
	System.out.println(s1);
	}
}
