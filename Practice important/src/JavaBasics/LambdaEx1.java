package JavaBasics;

interface Lamb
{
  public String show(String s);
  
}

/*interface Lamb2
{
	public void add();
	public static void show2(String s1) 
	{
		for (int i = 1; i <=5; i++) {
			System.out.println(s1);
		}	
	}
}*/

public class LambdaEx1 
{
	public static void main(String[] args) 
	{
       Lamb l = (s)->{
		return "Hello";
    	   
       };
       String s = null;
		for (int i =1 ;i <=5; i++) 
		{
			System.out.println(l.show(s));
		}
		
		/*Lamb2 l2 = ()->{
			
		};
		Lamb2.show2("Hii");
		*/
	}
}
