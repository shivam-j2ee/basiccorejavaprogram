package oop;

public class AbstrctImpl extends Abstrct {

	@Override
	public void view() {
System.out.println("view method");		
	}

	
	public static void main(String[] args) {
		Abstrct ab=new AbstrctImpl();
		ab.view();
	}
}
