package oop.TrialOop;

public class Shape {

	private String color;
	private String borderWidth;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public double area() {
		System.out.println("area of shape class");
		return 0;
	}
	
}
