package in.rays.OOP.Polymorphism.Array;

public class TestArrayOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape[] s = new Shape[2];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		
		
	     System.out.println(s[0].area());
	     System.out.println(s[1].area());
	
	}
	
}
