package oop.TrialOop;

public class InterImpl implements Inter{

	@Override
	public int add(int a, int b) {
System.out.println(a+b);
return 0;
	}
	public static void main(String[] args) {
		
	
	Inter i=new InterImpl();
	i.add(3, 5);
	}
}
