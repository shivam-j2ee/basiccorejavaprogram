package OOPPractice;

public class TestMethodArgument 
{
	public static void main(String[] args) 
	{
       Shape s1 = getShape(1);
       System.out.println(s1.area());
       
       Shape s2 = getShape(2);
       System.out.println(s2.area());
	}
	
	public static Shape getShape(int i)
	{
		if(i==1)
		{
			return new Circle();
		}
		if(i==2)
		{
			return new Rectangle();
		}
		return null;
	}
}
