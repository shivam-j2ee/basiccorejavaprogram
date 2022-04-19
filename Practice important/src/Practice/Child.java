package Practice;

public class Child extends Parent
{
	public void show() 
	{
		super.show();
     System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
	  Parent p = new Child();
	  p.show();
	  
	  Child c = new Child();
	  c.show();
	}
}
