package JavaBasics;

public class Swapping 
{
	public static void main(String[] args) 
	{
       int a=10;
       int b=20;
       
       a=a+b;
       b=a-b;
       a=a-b;
       
       System.out.println(a);
       System.out.println(b);
       
       //Swapping using 3rd variable
        int x=30;
		int y = 20;
		int z = 0;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println(x);
		System.out.println(y);
	}
}
