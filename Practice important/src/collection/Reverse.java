package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Reverse 
{
	public static void main(String[] args) 
	{
      ArrayList l = new ArrayList<>();
      l.add("Pradeep");
      l.add("Rahul");
      
      ListIterator it = l.listIterator(l.size());
      
		while (it.hasPrevious()) {
         Object o = it.previous();
         System.out.println(o);
		}
	}
}
