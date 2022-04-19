package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableTest 
{
	public static void main(String[] args) 
	{
		//If roll is of type int
     /*MarksheetComparable m1 = new MarksheetComparable("Ram", 122);
     MarksheetComparable m2 = new MarksheetComparable("manoj", 1333);
     MarksheetComparable m3 = new MarksheetComparable("Amit", 147);*/
		
		//If roll is of type String
		 MarksheetComparable m1 = new MarksheetComparable("Ram", "122");
	     MarksheetComparable m2 = new MarksheetComparable("manoj", "133");
	     MarksheetComparable m3 = new MarksheetComparable("Amit", "147");
     
     ArrayList a = new ArrayList<>();
     a.add(m1);
     a.add(m2);
     a.add(m3);
     
     Collections.sort(a);
     
     for (Object object : a) {
		System.out.println(object);
	}
     
	}
}
