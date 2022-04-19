package trial.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseList {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		int size = al.size();
		ListIterator it = al.listIterator(size);
		while (it.hasPrevious()) {
			Object o = it.previous();
			System.out.println(o);
		}
	}
}
