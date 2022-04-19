package in.co.rays.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExam {
public static void main(String[] args) {
	
	//koi v element print krega only one null value no duplicate record
	
	HashSet h2 = new HashSet<>();
	h2.add(15);
	h2.add(1);
	h2.add(11);
	h2.add(1);
	h2.add(16);
	h2.add(null);
	h2.add(null);
	h2.add(0);
	System.out.println(h2);

	//line s print,one null value,no duplicate value

	LinkedHashSet h1 = new LinkedHashSet<>();
h1.add(15);
h1.add(1);
h1.add(11);
h1.add(1);
h1.add(16);
h1.add(null);
h1.add(null);
System.out.println(h1);


	//asscending order, no null value ,no duplicate value
	
TreeSet h = new TreeSet<>();
h.add(15);
h.add(1);
h.add(11);
h.add(1);
h.add(16);
//h.add(null);   //null pointer exception
//h.add(null);
System.out.println(h);


}
}