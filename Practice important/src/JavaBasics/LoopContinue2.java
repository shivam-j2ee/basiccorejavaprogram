package JavaBasics;

public class LoopContinue2 
{
	public static void main(String[] args) 
	{
      int[][]table = {{1,2},{4,6},{3,5}};
      
	outerFor:for (int[] is : table) 
		{
			for (int i : is) 
			{
              if(i%2==1)
              {
            	continue outerFor;  
              }
			}
		}
      
	}
}
