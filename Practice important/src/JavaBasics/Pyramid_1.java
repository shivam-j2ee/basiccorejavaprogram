package JavaBasics;

public class Pyramid_1 
{
	public static void main(String[] args) 
	{
		
	  /*5 
		4 4 
		3 3 3 
		2 2 2 2 
		1 1 1 1 1*/
		
		/*for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j<=5; j++)
			{
              if(j<=i)
              {
            	  System.out.print(j);
              }else
              {
            	 System.out.print(" "); 
              }
			}
			System.out.println("\n");
		}*/
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j<=5; j++)
			{
              if(j<=6-i)
              {
            	  System.out.print("*");
              }else
              {
            	 System.out.print(" "); 
              }
			}
			System.out.println();
		}
	}
}
