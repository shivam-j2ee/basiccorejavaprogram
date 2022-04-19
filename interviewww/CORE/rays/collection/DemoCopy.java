package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCopy {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();

		a.add(1);
		a.add("ooo");
		a.add(3);
		System.out.println(a);

		ArrayList a1 = new ArrayList<>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("zameer");

		System.out.println(a1);

		Collections.copy(a1, a);

		System.out.println(a);
		System.out.println(a1);

	}
}
