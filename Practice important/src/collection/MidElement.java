package collection;

import java.util.LinkedList;

public class MidElement 
{
	public static void main(String[] args) 
	{
      LinkedList l = new LinkedList<>();
      l.add("One");
      l.add("Two");
      /*l.add("Three");*/
      
      int mid = l.size()/2;
      
      if(mid%2==0)
      {
    	  System.out.println(mid-1);
      }else
      {
    	  System.out.println(mid);
      }
	}
}
