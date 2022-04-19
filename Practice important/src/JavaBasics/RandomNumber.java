package JavaBasics;

public class RandomNumber 
{
	public static void main(String[] args) 
	{
     //Random Number between 100 - 200
		
		int max=200;
		int min=100;
		
		for (int i = 0; i <5; i++) 
		{
			/*int d =(int) (Math.random()*100);*/
         int d =(int) ((Math.random()*(max-min))+min);
         System.out.println(d);
		}
	}
}
