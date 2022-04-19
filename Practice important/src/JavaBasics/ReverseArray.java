package JavaBasics;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[]a = {50,8,9,0,6,4,5};
		int temp=0;
		
		/*for (int i : a) 
		{
         System.out.print(i+" ");
		}
		*/
		for (int i = 0; i < a.length/2; i++) 
		{
          temp=a[i];
          a[i] = a[a.length-i-1];
          a[a.length-i-1]=temp;
		}
//		System.out.println("---------");
	
		for (int i = 0; i < a.length; i++) 
		{
         System.out.print(a[i]+" ");
		}
	}
}
