package OOP;

public class ExplicitConsCalling extends ExplicitConstructor
{
	public ExplicitConsCalling() 
	{
	 /*super();*/
      System.out.println("Child class Constructor");
	}
	
	public static void main(String[] args) 
	{
      ExplicitConsCalling call = new ExplicitConsCalling();
      System.out.println("main");
	}
}
