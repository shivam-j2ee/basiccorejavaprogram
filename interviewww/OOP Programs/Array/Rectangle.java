package in.rays.OOP.Polymorphism.Array;

public class Rectangle extends Shape{

	
	private int length=10;
	private int width=8;
	
	
	/*public int getLength(){
		
		return length;
	}
	
	public void setLength(int l){
		this.length=l;
	}
	
	public int getWidth(){
		
		return width;
	}
	
	public void setWidth(int b){
		this.width=b;
	}
*/	
	public double area(){
		
		return length*width;
	}
}
