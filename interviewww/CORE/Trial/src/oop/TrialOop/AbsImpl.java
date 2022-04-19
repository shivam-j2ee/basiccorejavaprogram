package oop.TrialOop;

public class AbsImpl extends Abstrct {

	@Override
	public int add(int a,int b) {
		System.out.println(a+b);

	return 0;
	
	}
	public static void main(String[] args) {
		Abstrct a2=new AbsImpl();
		a2.add(4, 6);
	}
}
