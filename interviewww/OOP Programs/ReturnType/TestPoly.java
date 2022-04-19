package in.rays.OOP.Polymorphism.ReturnType;

public class TestPoly {

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Rectangle();
		}
		return new Shape();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape ob = getShape(1);
		Shape ob1 = getShape(2);
		
		System.out.println(ob.area());
		System.out.println(ob1.area());

	}

}
