package oop.TrialOop;

public class TestShape {
public static void main(String[] args) {

	Circle c=new Circle();
	c.setRadius(4);
	System.out.println(c.getRadius());
	System.out.println(c.area());
	
	Rectangle r=new Rectangle();
	r.setLength(5);
	r.setWidth(5);
	
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	Shape s=new Rectangle();

	System.out.println(r.area());
}}
