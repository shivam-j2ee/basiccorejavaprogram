package Exception;

public class Finally 
{
	public static void main(String[] args) 
	{
		try 
		{
          int a=10;
          int b=0;
          int c = a/b;
          
          System.out.println(c);
          System.exit(1);
		} catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}finally {
			System.out.println("finally Block");
		}
	}
}
