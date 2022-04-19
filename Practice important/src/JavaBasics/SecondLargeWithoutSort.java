package JavaBasics;

public class SecondLargeWithoutSort 
{
	public static void main(String[] args) 
	{
		
		int[] a = {500,100,47,86,92,52,48,99,66,85};
		
		int large=0 , sLarge=0 , tLarge=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > large) 
			{
               sLarge = large;
               tLarge = large;
               large = a[i];
			}
			else if(a[i]>sLarge)
			{
				tLarge = sLarge;
			    sLarge = a[i];	
			}
			else if(a[i]>tLarge)
			{
				tLarge=a[i];
			}
		}
		System.out.println("First Largr is "+large);
		System.out.println("Second Largr is "+sLarge);
		System.out.println("Third Largr is "+tLarge);
	}
}
