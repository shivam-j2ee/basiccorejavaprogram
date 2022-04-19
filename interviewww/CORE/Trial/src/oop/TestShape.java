package oop;
    
public class TestShape {
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(4);
		
		Rectangle r=new Rectangle();
		r.setLength(34);
		r.setWidth(33);
		
		//Shape s=new Circle();
		
		/*System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());*/
		/*System.out.println(c.area());
		System.out.println(r.area());*/
		//System.out.println(s.area());
		
		//polymorphism using array...
		Shape[] s=new Shape[2];
		s[0]=new Circle();
		s[1]=new Rectangle();
		//s[2]=new Shape();
		are(s);
	}	
		 static void are(Shape[] s) {
		for(Shape a:s) {
			a.area();
		}
		}
	
	}

