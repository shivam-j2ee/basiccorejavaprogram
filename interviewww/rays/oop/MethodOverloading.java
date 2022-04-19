package in.co.rays.oop;

public class MethodOverloading {

	public void add(int a,int b){
		System.out.println(a+b);
		
	}
	public int add(float a,float b,float c){
		System.out.println(a+b+c);
		return 0;
		
	}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.add( 4, 5);
		m.add(4, 5, 5);
	}
}
