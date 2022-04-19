package in.co.rays.collection;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		v.add("aaa");
		v.add("vvv");
		v.add("bbb");
		v.add("xxx");
		System.out.println(v);
		
		Stack s=new Stack<>();
		s.push("one");
		s.push("fgh");
		s.push("hgfhf");
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
	}
}
