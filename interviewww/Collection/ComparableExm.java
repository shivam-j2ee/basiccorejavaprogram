package extr;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableExm {
	
	public static void main(String[] args) {
		
		MarksheetComparable m1 = new MarksheetComparable(123, "Ram");
		MarksheetComparable m3 = new MarksheetComparable(125, "shubham");
		MarksheetComparable m2 = new MarksheetComparable(124, "manoj");
		
		ArrayList al = new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		
		Collections.sort(al);
		
		for(Object o:al) {
			System.out.println(o);
		}
		
	}

}
