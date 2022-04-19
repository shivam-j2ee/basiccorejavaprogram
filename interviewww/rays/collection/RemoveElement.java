 package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		System.out.println(al);
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {

			Object o = itr.next();

			if (o.equals(2)) {

				itr.remove();
			}
		}
		System.out.println(al);

	}

}