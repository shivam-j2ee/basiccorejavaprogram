package collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSaifOREnumeration 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector<>();
		v.add("1");
		v.add("2");
		
		/*Iterator i = v.iterator();
		while(i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
		}*/
		
		Enumeration e = v.elements();
		v.add("D");
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}
	
}
