package com.raystech.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		//Sort element in ascending order and doesn't allow null value
		TreeSet t = new TreeSet<>();
		//t.add(1);
		t.add("null");
		//t.add(null);
		t.add("Pal");
		t.add("Harish");
		//t.add(1);
		//t.add(20);
		t.add("Hukum");
		t.add("Honey");
		t.add("Pal");
		//t.add(8);
		
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t);
		
		
	}

}
	/*public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparater());
		
		
		t.add(new StringBuffer("priya"));
		t.add(new StringBuffer("pooja"));
		t.add(new String("shirya"));
		t.add(new String("nikita"));
		System.out.println(t);

	}

}

class MyComparater implements Comparator
{

	@Override
	public int compare(Object ob1, Object ob2) {
		String s=ob1.toString();
		String s1=ob2.toString();
		
		int a=s.length();
		int b=s1.length();
		
		if(a<b)
			return -1;
		else if(a>b)
			return 1;
		
		else
		return 0;
	}

}*/
