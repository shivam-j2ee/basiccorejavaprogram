package in.rays.OOP.InterfaceOverriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bank ob = new Pnb();
		Bank ob1 = new Axis();
		
		System.out.println(ob.interestRate());
		System.out.println(ob1.interestRate());
	}

}
