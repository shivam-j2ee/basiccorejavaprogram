package in.co.rays.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//permits nul key & value, not a orderd collection.
		HashMap map=new HashMap<>();
		
		map.put(4, "ajay");
		map.put(2,"vijay");
		map.put(null, "emo");
		
		//System.out.println(map.size()); 
		System.out.println(map);
		//System.out.println(map.get(1));
		
		//sorted in ascending key order
		TreeMap m=new TreeMap<>();
		m.put("1", "one");
		m.put("2", "one");
		m.put("5", "one");
		m.put("4", "one");
		
		System.out.println(m);
		
		//like haspMap but take Non-Null key&value.
		Hashtable t=new Hashtable<>();
		t.put("3", "one");
		t.put("9", "two");
		t.put("7", "three");
		t.put("10", "four");
		System.out.println(t);
		
		//insertion order
		LinkedHashMap lm=new LinkedHashMap<>();
		lm.put("1", "one");
		lm.put("2", "two");
 		lm.put(3, null);
		lm.put("4", "four");
		System.out.println(lm);
		
	
	}
}