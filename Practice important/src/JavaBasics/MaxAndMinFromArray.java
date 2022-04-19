package JavaBasics;

public class MaxAndMinFromArray 
{
	public static void main(String[] args) 
	{
      int[]a = {105,8,500,5,6,2,85,104};
      int max=0;
    //  int min =a[0] ;
      int min =0;
      
		for (int i = 0; i < a.length; i++) 
		{
          if(a[i]>max)
          {
        	  max = a[i]; 
          }
          else if(a[i]<min)
          {
        	  min = a[i];
          }
		}
      System.out.println("max is  "+max);
      System.out.println("min is  "+min);
      
	}
}
