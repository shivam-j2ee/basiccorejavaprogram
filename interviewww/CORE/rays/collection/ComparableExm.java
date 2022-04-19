package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExm {
	
	public static void main(String[] args) {
		
		MarksheetComparable m1 = new MarksheetComparable("123si1", "Ram");
		MarksheetComparable m3 = new MarksheetComparable("125si3", "shubham");
		MarksheetComparable m2 = new MarksheetComparable("124si2", "manoj");
		
		ArrayList al = new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		
		Collections.sort(al);
		//print all elements of collection 
		for(Object o:al) {
			System.out.println(o);
		}
		
	}

}
