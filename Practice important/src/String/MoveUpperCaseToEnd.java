package String;


/**
 * Move All UpperCase Letters to End Of String
 *
 */
public class MoveUpperCaseToEnd
{
	public static void main(String[] args) 
	{
      String s = "Geeksforgeeks A Computer Science Portal for Geeks!!";
      
      String s1 = "";
   //   System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) 
		{
           if(Character.isUpperCase(s.charAt(i)))
           {
        	   s1 = s1+s.charAt(i);
     //   	   System.out.println(s1);
       // 	  s = s.replace(s.charAt(i), ' ');
           }
		}
     // s = s+s1;
      System.out.println(s1);
     // System.out.println(s);
	}
}
