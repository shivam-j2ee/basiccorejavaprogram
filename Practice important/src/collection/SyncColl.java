package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SyncColl 
{
	public static void main(String[] args) 
	{
     Collection c = new ArrayList<>();
     c.add(1);
     c.add(3);
     c.add(2);
     
     Collection co = Collections.synchronizedCollection(c);
     
     System.out.println(c);
	}
}
