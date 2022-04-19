package Practice;

public class E extends C
{
	
	public void getE() 
	{
		System.out.println("E class");
	}
	
	public static void main(String[] args) 
	{
     E e = new E();
     e.getA();
     e.getB();
     e.getC();
     
     D d = new D();
     d.getA();
     d.getB();
     d.getC();
     
	}
}
