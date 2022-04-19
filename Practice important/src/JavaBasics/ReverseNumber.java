package JavaBasics;

public class ReverseNumber 
{
	// pallidrom number 
	public static void main(String[] args) 
	{
		int no=12321;
		int result = 0;
		
		while (no > 0) 
		{
          int a = no%10;
          result = result*10+a;
          no= no/10;
		}
		System.out.println(result);
	}
}
