package JavaBasics;

public class Pattern_2 
{
	public static void main(String[] args) 
	{
		
/*      *******
		 ***** 
		  ***  
		   *     */   

	
		boolean k = true;
		
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 7; j++) 
			{
              if(j>=i && j<=8-i)
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
