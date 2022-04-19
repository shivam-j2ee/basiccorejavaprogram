package OOPDeepCloning;

 interface test2 
{
	 int a=2;
  public void test2();
  
  public void show();
}

public class Instantiate
{
	public static void main(String[] args) 
	{

		 test2 t2 = new test2() {
				
				@Override
				public void test2() {
					System.out.println("t2222222");
					
				}
				
				@Override
				public void show() {
					System.out.println("t11111111");
					
				}
			};
			int a = t2.a;
			t2.show();
			t2.test2();
			System.out.println(a);
	}
}
