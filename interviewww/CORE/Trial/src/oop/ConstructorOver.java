package oop;

public class ConstructorOver {
	
	private int a;
	private int b;

	public ConstructorOver() {
		System.out.println("default constructor");
	}
	
	public ConstructorOver(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		System.out.println("parameterized constructor");
	}
	
	public static void main(String[] args) {
		ConstructorOver co=new ConstructorOver();
		ConstructorOver co1=new ConstructorOver(4,6);
	}
}
 