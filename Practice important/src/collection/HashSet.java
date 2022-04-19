package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet 
{
	public static void main(String[] args) 
	{
      java.util.HashSet hs = new java.util.HashSet<>();
      hs.add(2);
      hs.add(1);
      
      System.out.println(hs);
      
      
      LinkedHashSet ls = new LinkedHashSet<>();
      ls.add(3);
      ls.add(4);
      
      Iterator it = ls.iterator();
      
      while(it.hasNext())
      {
    	  Object o = it.next();
    	  System.out.println(o);
      }
      
      
      TreeSet ts = new TreeSet<>();
      ts.add(5);
      ts.add(6);
      System.out.println(ts);
      
      
      HashMap map = new HashMap<>();
      map.put(1, "Rahul");
      map.put(2, "Amit");
      map.put(3, "Pradeep");
      
      System.out.println(map);
	}
}
