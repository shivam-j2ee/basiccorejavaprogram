package OOP;

/**
 * Here Child class Triangle is Specialized Class that provides specialized
 * behaviour of Parent class Shape.
 * 
 * WE Ovrride Shape class specialized method area() in child class Triangle
 * Which is also known as Method Overriding.
 *
 */
public class Triangle extends Shape
{
  private int base = 0;
  private int height =0;
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
//Method Overriding
    @Override
	public double area() 
    {
		return (base * height/2) ;
	}
}
