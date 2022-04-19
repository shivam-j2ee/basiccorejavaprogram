package trial.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSalarySorting {
	// Descending order sorting...
public static void main(String[] args) {
	SalarySorting s=new SalarySorting();
	
	SalarySorting s1=new SalarySorting(5000,"Vicky");
	SalarySorting s2=new SalarySorting(10000,"Ricky");
	SalarySorting s3=new SalarySorting(20000,"visshu");
	
	ArrayList al=new ArrayList();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	Collections.sort(al,s);
	
	for(Object o:al) {
	System.out.println(o);
	}
}
}
