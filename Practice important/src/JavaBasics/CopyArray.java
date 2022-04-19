package JavaBasics;

public class CopyArray 
{
	public static void main(String[] args) 
	{
      int[]a = {50,8,9,0,6,4,5};
      int[]b = new int[a.length];
      
		for (int i = 0; i < b.length; i++) 
		{
         b[i]=a[i];
         
       //  System.out.print(b[i]+"");
		}
		for (int i = 0; i < b.length; i++) 
		{
         System.out.print(b[i]+" ");
		}
	}
}
