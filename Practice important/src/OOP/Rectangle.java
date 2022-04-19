package OOP;

/**
 * Here Child class Rectangle is Specialized Class that provides specialized
 * behaviour of Parent class Shape.
 * 
 * WE Ovrride Shape class specialized method area() in child class Rectangle
 * Which is also known as Method Overriding.
 *
 */
public class Rectangle extends Shape
{
  private int length=0;
  private int width =0;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
//Method Overriding
    @Override
	public double area() 
    {
		return (length*width);
	}
}
