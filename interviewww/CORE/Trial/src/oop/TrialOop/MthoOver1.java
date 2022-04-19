package oop.TrialOop;

public class MthoOver1 extends MthdOver {

	public int add(int a,int b) {
		System.out.println(a-b);
		return 0;
	}
	
	public static void main(String[] args) {
		MthdOver m=new MthdOver();
		m.add(6, 4);
		
		MthoOver1 n=new MthoOver1();
		n.add(6, 4);
		
		MthdOver mn=new MthoOver1();
		mn.add(6, 4);
	}
	
}
