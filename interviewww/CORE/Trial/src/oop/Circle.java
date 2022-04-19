package oop;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public double area() {
		super.area();
		System.out.println("Circle class");
		return 3.14*radius*radius;
		
	}
	
}
