package in.co.rays.oop;

public class TestSRCT {
	public static void main(String[] args) {
		
		//rectangle Test
		int width = 5, length = 7;
		Shape s = new Rectangle(length, width);
		System.out.println(width+" ,"+length+" ,"+s.area());
		
		//circel Test
		
		double radius = 5;
		Shape s1 = new Circle(radius);
		System.out.println(s1.area()+" ,"+radius);
		
		//triangle Test
		
		int base = 10, height = 15;
		Shape s3 = new Triangle(base, height);
		System.out.println(base+" ,"+height+" ,"+s3.area());
	}

}
