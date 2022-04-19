package Practice;

public class D extends C
{
	public void getD() 
	{
		System.out.println("D class");
	}
	
	@Override
	public void comman() 
	{
		/*super.comman();*/
     System.out.println("D comman");
	}
	
	public static void main(String[] args) 
	{
		D d = new D();
		d.getA();
		d.getB();
		d.getC();
		d.comman();
		
		/*C c = new C();
		c.getA();
		c.getB();
		c.getC();
		c.comman();*/
	}
}
