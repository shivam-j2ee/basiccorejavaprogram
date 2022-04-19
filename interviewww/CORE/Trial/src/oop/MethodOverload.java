package oop;

public class MethodOverload {
public int display(int a) {
	return a;
	
}

public int display(int a,int b) {
	return a+b;
	
}
public static void main(String[] args) {
	MethodOverload m=new MethodOverload();
	System.out.println(m.display(5));
	System.out.println(m.display(4, 8));
	
	
}
}
