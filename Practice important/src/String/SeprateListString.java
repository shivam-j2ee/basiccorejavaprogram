package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeprateListString 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList();
		list.add("Geeks");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		/*
		String s1 = "";
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) 
		{
         String s =(String) it.next();
         
         s1=s1+s+",";
		}
		System.out.println(s1);*/
		
		 // Convert the List of String to String
		String s = String.join(", ", list);
		
		System.out.println(s);
	}
}
