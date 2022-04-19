package in.co.rays.collection;

import java.util.ListIterator;
import java.util.Stack;

public class StackCopyExm {

	public static void main(String[] args) {

		Stack s = new Stack<>();

		s.push("ram");
		s.push("shyam");
		s.push("dhamu");
		s.push("janu");

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
