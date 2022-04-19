package oop.TrialOop;

public class MthdOverloading {

	public int add(int a,int b) {
		System.out.println(a+b);
		return 0;
	}
	public int add(int a,int b,int c) {
	System.out.println(a*b*c);
	return 0;
	}
	public static void main(String[] args) {
		MthdOverloading mo=new MthdOverloading();
		mo.add(4, 6);
		mo.add(2, 3, 4);
	}
}
