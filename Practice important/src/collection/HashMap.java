package collection;

import java.util.Map;

public class HashMap 
{
	public static void main(String[] args) 
	{
     Map map = new java.util.HashMap(); 
     map.put("1", "One");
     map.put("2", "Two");
     map.put("null", "null");
     map.put("zero", "null");
     map.put("null", "Eight");
     map.put("null", "Ten");
     map.put("null", "Seven");
     map.put("null", "Nine");
     map.put("null", "Eight");
     map.put("3", "3");
     
     System.out.println(map);
     System.out.println(map.keySet());
     System.out.println(map.values());
     System.out.println(map.entrySet());
     
     
	}
}
