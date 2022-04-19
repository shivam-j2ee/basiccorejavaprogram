package extr;

import java.util.ListIterator;
import java.util.Stack;

public class StackCopyExm {

	public static void main(String[] args) {

		Stack s = new Stack<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println(s);

		Stack s1 = new Stack<>();

		ListIterator list = s.listIterator();

		while (list.hasNext()) {
			list.next();
		}
		while (list.hasPrevious()) {
			Object ob = list.previous();
			s1.push(ob);
		}
		System.out.println(s1);
	}

}
