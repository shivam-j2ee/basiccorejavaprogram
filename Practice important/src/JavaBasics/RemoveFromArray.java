package JavaBasics;

public class RemoveFromArray 
{
	public static void main(String[] args) 
	{
      int[] a = {1,43,45,65,78,7,9};
      
      int no= 65;
      int loc=2;
      boolean flag = true;
      
		for (int i = 0; i < a.length; i++) 
		{
           if(a[i]==no)
           {
        	   flag = false;
        	   loc = i;
        	   break;
           }
		}
		for (int i = loc + 1; i < a.length; i++) 
		{
          a[i-1] = a[i];
		}
		for (int i = 0; i < a.length-1; i++) 
		{
			 System.out.print(a[i]+" ");
		}
	}
}
