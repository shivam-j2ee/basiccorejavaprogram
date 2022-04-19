package JavaBasics;

public class fibonacci 
{
	public static void main(String[] args) 
	{
     
		 int a=0;
		 int b=1;
		 int c=0;
		 int n=10;
		// System.out.print(a+" "+b+" ");
		 for (int i = 0; i <n; i++) {
			 c=a+b;
			a=b;
			b=c;
			System.out.print(c +" ");
		}
		
	}
}
