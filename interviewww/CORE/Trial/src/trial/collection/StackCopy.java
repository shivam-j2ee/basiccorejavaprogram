package trial.collection;

import java.util.Stack;

public class StackCopy {
public static void main(String[] args) {
	Stack s=new Stack();
	
	for(int i=1;i<=5;i++) {
		s.push(i);
	}
	System.out.println(s);
	System.out.println(s.size());
	
	Stack s2=new Stack<>();
	
	for(int i=1;i<=5;i++) {
		s2.push(s.pop());
	}
	System.out.println(s2);
	System.out.println(s2.size());
}
}
