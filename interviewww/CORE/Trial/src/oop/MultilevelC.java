package oop;

public class MultilevelC extends MultilevelB {

	public void C() {
		System.out.println("C class of Multilevel Inheritance");
	}
	public static void main(String[] args) {
		MultilevelC c=new MultilevelC();
         c.A();
         c.B();
         c.C();
	}
}
