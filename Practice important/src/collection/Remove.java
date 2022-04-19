package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove 
{
	public static void main(String[] args) 
	{
     ArrayList l = new ArrayList<>();
     l.add(1);
     l.add(2);
     l.add(3);
     l.add(4);
     l.add(5);
     
     Iterator it = l.iterator();
     
     while(it.hasNext())
     {
    	 Object o = it.next();
    	 
    	 if(o.equals(1))
    	 {
    		 it.remove();
    	 }
     }
     System.out.println(l);
	}
}
