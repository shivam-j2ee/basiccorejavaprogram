package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice 
{
	public static void main(String[] args) 
	{
	  //Duplicate element and null value not allowed in TreeSet
	  // Automatically maintain Accending sorting order
      TreeSet ts = new TreeSet<>();
      ts.add(2);
      ts.add(2);
      ts.add(1);
      ts.add(1);
      System.out.println(ts);
      
       //Duplicate element not allowed in Hash
      //It contain only one null value
      HashSet hs = new HashSet<>();
      hs.add(5);
      hs.add(5);
      hs.add(3);
      hs.add(3);
      hs.add(null);
      hs.add(null);
      System.out.println(hs);
      
      //Duplicate element not allowed in LinkedHashSet
	  // Automatically maintain insertion Order 
      //Elements are iterated in same order in which they have been inserted
      //It contain only one null value
      LinkedHashSet lhs = new LinkedHashSet<>();
      lhs.add(7);
      lhs.add(7);
      lhs.add(6);
      lhs.add(6);
      lhs.add(null);
      System.out.println(lhs);
      
      
      //Duplicates elements not allowed
      //null keys and values are allowed
      //It does not return keys and values in same order in which they
      //were inserted in to HashMap
      HashMap map = new HashMap<>();
      map.put(null,"Zero");
      map.put(null,null);
      map.put(3,3);
      map.put(2,2);
      System.out.println(map);
      
       //Duplicates elements not allowed
      //null keys and values are not allowed
      Hashtable ht = new Hashtable<>();
      ht.put(1,1);
      ht.put(3,3);
      ht.put(2,2);
      ht.put(2,2);
      System.out.println(ht);
      
      
      TreeMap tm = new TreeMap<>();
      tm.put("1", "One");
      tm.put("3", "Tree");
      tm.put("2", "Two");
      tm.put("5", "Five");
      tm.put("4", "Four");
      tm.put("5",null);
      System.out.println(tm);
      
      
      Queue q = new PriorityQueue();
      q.add("asa3");
      q.add("asa1");
      q.add("asas");
      
      Object ele = q.element();
      System.out.println(ele);
      
      ele = q.remove();
      
      Iterator it = q.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      
      
	}
}
