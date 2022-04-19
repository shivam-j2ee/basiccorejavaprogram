package OOPDeepCloning;

public class InstantiateTest 
{
	public static void main(String[] args) 
	{
		test2 t2 = new test2() {

			@Override
			public void test2() {
				System.out.println("test2 calling");
			}

			@Override
			public void show() {
				System.out.println("Show calling");
			}
		};
		
		t2.show();
		t2.test2();
		System.out.println("main calling");
	}
}
