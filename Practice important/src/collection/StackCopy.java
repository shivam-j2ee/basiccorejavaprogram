package collection;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class StackCopy 
{
	public static void main(String[] args) 
	{
     Stack s = new Stack<>();
     s.push(1);
     s.push(2);
     
     Stack s1 = new Stack<>();
     /*s1.push(s);*/
     
     for (int i = 0; i < s.size(); i++) {
		s1.push(s.get(i));
	}
     
     System.out.println(s1);
     
     
     Vector v = new Vector<>();
     v.add("A");
     v.add("B");
     v.add("C");
     
     System.out.println(v);
     
     Enumeration e = v.elements();
     
     while(e.hasMoreElements())
     {
    	 Object o = e.nextElement();
    	 System.out.println(o);
     }
     
     
     
	}
}
