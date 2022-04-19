package trial.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetComparable {
public static void main(String[] args) {
	
	MarksheetComparable m1=new MarksheetComparable(101,"ricky");
	MarksheetComparable m2=new MarksheetComparable(103,"vicky");
	MarksheetComparable m3=new MarksheetComparable(102,"nicky");

	
	ArrayList al=new ArrayList();
	al.add(m1);
	al.add(m2);
	al.add(m3);
	
	Collections.sort(al);
	for(Object o:al) {
		System.out.println(o);
	}
}
}
