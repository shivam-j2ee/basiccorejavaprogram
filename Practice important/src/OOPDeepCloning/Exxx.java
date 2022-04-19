package OOPDeepCloning;

public class Exxx implements Runnable
{

	@Override
	public void run() 
	{
		for (int i =1; i <5; i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) 
	{
     Exxx e = new Exxx();
     e.run();
	}

}
