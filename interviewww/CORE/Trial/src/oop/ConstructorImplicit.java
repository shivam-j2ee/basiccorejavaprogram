package oop;

public class ConstructorImplicit extends ConstructorOver {

	public ConstructorImplicit() {
		super();
		System.out.println("default constructor of child class");
	}
	public static void main(String[] args) {
		ConstructorImplicit ci=new ConstructorImplicit();
	}
}
