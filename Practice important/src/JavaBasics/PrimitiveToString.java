package JavaBasics;

public class PrimitiveToString 
{
	public static void main(String[] args) 
	{
		//Primitive to String
      int i=10;
      
      String s = String.valueOf(i);
      
      System.out.println(s);
	
    // String to Primitive
      
      String s1 = new String("50");
      
      int a = Integer.parseInt(s1);
      
      System.out.println(a);
	
	
	}
}
