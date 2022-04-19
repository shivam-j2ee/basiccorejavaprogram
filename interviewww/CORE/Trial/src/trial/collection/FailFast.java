package trial.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	
	Iterator it=al.iterator();
	
	al.add(4);
	while(it.hasNext()) {
	Object o=it.next();
	System.out.println(o);
	}
			
}
}
