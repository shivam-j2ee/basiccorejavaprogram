package in.co.rays.oop;

//Overriding
public class ChildClass extends ParentClass{

	@Override
	public void getName(String name){
		System.out.println("in child class");
		super.getName("Abhi");
	}
	public static void main(String[] args) {
		 ChildClass cc = new ChildClass();
		 cc.getName("saar");
	}
}
