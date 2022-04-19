package in.co.rays.oop;

public class ExplicitConstructor1 extends ExplicitConstructor {
	
	public ExplicitConstructor1(){
		super();
		System.out.println("cons");
	}
	
	public static void main(String[] args) {
		 ExplicitConstructor1 e = new ExplicitConstructor1();
		 System.out.println("Explicit main method");
	}
}
