package extr;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExam {
public static void main(String[] args) {
	
	//koi v element print krega only one null value no duplicate record
	
	/*HashSet h = new HashSet<>();
	h.add(15);
	h.add(1);
	h.add(11);
	h.add(1);
	h.add(16);
	h.add(null);
	h.add(null);
	System.out.println(h);
*/
	//line s print,one null value,no duplicate value

/*	LinkedHashSet h = new LinkedHashSet<>();
h.add(15);
h.add(1);
h.add(11);
h.add(1);
h.add(16);
h.add(null);
h.add(null);
System.out.println(h);
*/

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
