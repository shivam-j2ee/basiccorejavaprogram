package OOP;

/**
 *  Gathering all related attributes and methods in a class is called
 *  encapsulation.Encpsulated class is also called Expert Class because
 *  it binds only related attributes and methods.
 *  
 *  Shape is Encapsulated or Expert class
 */
public class Shape 
{
   private String color = null;
   private int borderWidth = 0;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getBorderWidth() {
	return borderWidth;
}
public void setBorderWidth(int borderWidth) {
	this.borderWidth = borderWidth;
}
   
public double area() {
	return 0;
}
   
}
