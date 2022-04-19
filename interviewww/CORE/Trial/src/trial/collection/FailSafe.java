package trial.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("1");
		v.add("2");
		
		Enumeration e=v.elements();
		
	    v.add(3);
		while(e.hasMoreElements()) {
		Object o=e.nextElement();
		System.out.println(o);
		}
				
	}
	}
