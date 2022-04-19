package trial.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	
	Iterator it=al.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		if(o.equals(2)) {
			it.remove();
		}}
		System.out.println(al);
	
}
}
