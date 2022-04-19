package OOP;


/**
 * Here Child class Circle is Specialized Class that provides specialized
 * behaviour of Parent class Shape.
 * 
 * WE Ovrride Shape class specialized method area() in child class Circle
 * Which is also known as Method Overriding.
 *
 */
public class Circle extends Shape
{
   private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

   //Method Overriding
   @Override
	public double area() 
    {
		return (3.14*radius*radius);
	}
  
}
