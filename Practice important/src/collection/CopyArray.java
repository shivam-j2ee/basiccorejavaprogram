package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import Practice.A;

public class CopyArray 
{
	public static void main(String[] args) 
	{
      ArrayList a = new ArrayList<>();
      a.add("J");
      a.add("A");
      a.add("V");
      a.add("A");
      
      ArrayList a1 = new ArrayList<>();
      a1.add("S");
      a1.add("O");
      a1.add("F");
      a1.add("T");
      
      //Collections.copy(destination, from which);
      Collections.copy(a1, a);
      
      System.out.println(a);
      System.out.println(a1);
	}
}
