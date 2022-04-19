package in.co.rays.oop;

public class ImplicitConstructor {

	public ImplicitConstructor(){
		System.out.println("Implicit constructor calling");
		
	}
	public static void main(String[] args) {
		 ImplicitConstructor imp = new ImplicitConstructor();
		 System.out.println("in main method");
	}
}
