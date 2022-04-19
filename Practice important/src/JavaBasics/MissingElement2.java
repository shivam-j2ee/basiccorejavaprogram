package JavaBasics;

public class MissingElement2 
{
	public static void main(String[] args) 
	{
		int[] a = {2,4,6,8,10,11,55,66};
		int[] b = {3,6,8,9,12,88,11,66};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < b.length; j++) 
			{
               if(a[i]==b[j])
               {
            	   flag = true; 
               }
			}
			if(flag==false)
			{
				System.out.println("a = "+a[i]);
			}
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < a.length; j++) 
			{
              if(b[i]==a[j])
              {
            	 flag = true; 
              }
			}
			if(flag==false)
			{
				System.out.println("b = "+b[i]);
			}
		}
	}
}
