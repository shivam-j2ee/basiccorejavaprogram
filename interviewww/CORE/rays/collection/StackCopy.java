package in.co.rays.collection;

import java.util.Stack;

public class StackCopy {

	public static void main(String[] args) {
		
		Stack s1 = new Stack<>();
		
		/*s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		*/
		for(int i=1; i<=5; i++) {
			s1.push(i);
		}
		
		System.out.println(s1);
		
		Stack s2 = new Stack<>();
		
		int size = s1.size();
		
		for(int i=0; i<size; i++) {
			
			s2.push(s1.pop());
		}
		System.out.println(s2);
	}
}
