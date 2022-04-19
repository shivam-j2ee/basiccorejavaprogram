package JavaBasics;

public class InsertInArray 
{
	public static void main(String[] args) 
	{
     int[] a = {5,0,9,59,20,40,50};
     
     int no=88;
     int loc = 2;
     
		for (int i =a.length-1; i>loc-1; i--) 
		{
         a[i]=a[i-1];
		}
		a[loc-1]=no;

		for (int i = 0; i < a.length; i++) 
		{
          System.out.print(a[i]+" ");
		}
     
	}
}
