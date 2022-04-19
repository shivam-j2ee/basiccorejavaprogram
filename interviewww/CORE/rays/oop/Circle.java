package in.co.rays.oop;

public class Circle extends Shape{

	private double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	
	protected double area(){
		return 3.14 * radius * radius;
	}
}
