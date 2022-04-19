package Exception;

public class MultiExceptionInOneCatch 
{
	public static void main(String[] args) 
	{
     String name  = null;
     
		try 
		{
          System.out.println(name.charAt(8));
          System.out.println(name.length());
		} catch (NullPointerException | StringIndexOutOfBoundsException  e) {
			e.printStackTrace();
		}
      
	}
}
