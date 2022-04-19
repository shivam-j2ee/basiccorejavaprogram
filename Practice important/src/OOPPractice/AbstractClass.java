package OOPPractice;


abstract class MyArea
{
	public abstract double area();
	
	public MyArea() {
		// TODO Auto-generated constructor stub
	}
}


public class AbstractClass extends MyArea
{
    double radius = 2;

	@Override
	public double area() 
	{
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) 
	{
	 AbstractClass c = new AbstractClass();
	 double d = c.area();
	 System.out.println(d);
	}
}
