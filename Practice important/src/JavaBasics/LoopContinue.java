package JavaBasics;

public class LoopContinue 
{
	public static void main(String[] args) 
	{
     int[] no = {1,2,3,4,5};
     
		for (int i : no) 
		{
          if(i%2>0)
          {
        	  
        	  continue;
          }
          System.out.println(i);
		}
     //Output will be:- 1 3 5
	}
}
