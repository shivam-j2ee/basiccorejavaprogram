package OOPPractice;

public class Rectangle extends Shape
{
  private int length=2;
  private int width=2;
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
  
	@Override
	public double area() 
	{
	  return (length*width);	
	}
  
  
}
