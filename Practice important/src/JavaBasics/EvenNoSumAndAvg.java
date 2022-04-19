package JavaBasics;

public class EvenNoSumAndAvg 
{
	public static void main(String[] args) 
	{
		int evenSum=0;
		int oddSum=0;
		int evenCount=0;
		int oddCount=0;
     
		
		for (int i = 1; i < 50; i++) 
		{
          if(i%2==0)
          {
        	  evenSum = evenSum+i;
        	  evenCount++;
          }else
          {
        	  oddSum = oddSum+i;
        	  oddCount++;
          }
		}
		
		System.out.println("Sum of Even No is "+evenSum + "and Total Even No is "+evenCount);
		System.out.println("Sum of Odd No is "+oddSum + "and Total Odd No is "+oddCount);
	
	    double evenAvg = evenSum/evenCount;
	    double oddAvg = oddSum/oddCount;
	    
	    System.out.println("Even No Average  "+evenAvg);
	    System.out.println("Odd No Average   "+oddAvg);
	
	}
}
