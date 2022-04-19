package OOP;

public class Overload 
{
	 public void add(int a, int b)
	   {
		   int add = a+b;
		   System.out.println("Addition is "+add);
	   }
	 
	 public void add(double a, double b)
	   {
		   double add = a+b;
		   System.out.println("Addition is "+add);
	   }
	 
	 public void add(int a, int b , int c)
	   {
		   int add = a+b+c;
		   System.out.println("Addition is "+add);
	   }
	 
	public static void main(String[] args) 
	{
      Overload o = new Overload();
      o.add(10.5, 10.5);
      o.add(10, 10);
      o.add(10, 10, 10);
	}
}
