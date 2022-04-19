package oop;

public class IntrfceImpl implements Interfce {

	@Override
	public void display() {

        System.out.println("Hello Interface");		
	}
	
	public static void main(String[] args) {
		Interfce i=new IntrfceImpl();
		i.display();
	}

}
