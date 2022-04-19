package String;

import java.util.ArrayList;
import java.util.List;

public class CharToString 
{
	public static void main(String[] args) 
	{
		
     char[] ch ={'a','b','c','d'};
     
     String s = "";
     
		for (int i = 0; i < ch.length; i++) 
		{
           /*s = s+ch[i];*/
			s = s+String.valueOf(ch[i]);
		}
     System.out.println(s);
	}
}
