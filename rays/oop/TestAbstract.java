package in.co.rays.oop;

public class TestAbstract extends AbstractExam{

	@Override
	protected int add() {
		System.out.println(10+20);
		return 0;
	}

	public static void main(String[] args) {
		
		AbstractExam a = new TestAbstract();
		a.add();
	}
}
