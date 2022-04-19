package Practice;

public class Circle extends Shape
{
	int radius=2;
	@Override
	public void area() 
	{
		super.area();
     double area = 3.14*radius*radius;
     System.out.println("Circle are");
	}

	public static void main(String[] args) 
	{
      Circle s = new Circle();
      s.area();
	}
}
