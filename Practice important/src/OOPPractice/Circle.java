package OOPPractice;

public class Circle extends Shape
{
   private int radius=1;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
   
	@Override
	public double area() 
	{
     return 3.14*radius*radius;
	}
}
