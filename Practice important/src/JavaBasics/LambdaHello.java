package JavaBasics;

interface LambdaExp{
   public String hello(String name);
}
public class LambdaHello {

	private static String name;
	public static void main(String[] args)
	{
		LambdaExp  e=(name)->{
			return "hello";
		};
		
		for(int i=1;i<=5;i++){
			System.out.println(e.hello(name));
		}
	}
	
}
