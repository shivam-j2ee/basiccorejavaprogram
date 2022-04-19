package in.co.rays.oop;


public class Inover implements A,B {

	@Override
	public int multi() {
System.out.println(10*5);
		return 0;
	}

	@Override
	public int add() {
System.out.println(10+5);
return 0;
	}
	
	public static void main(String[] args) {
		 Inover i = new Inover();
		 i.add();
		 i.multi();
	}

}
