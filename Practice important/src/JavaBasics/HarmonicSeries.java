package JavaBasics;

public class HarmonicSeries 
{
	public static void main(String[] args) 
	{
		//First Way to Harmonic Series
		int n = 6;
		double sum= 0.0 ;
     
		for (int i =1; i <=n; i++) 
		{
         sum = sum+(double)1/i;
		}
		System.out.println("\n\nSum of Harmonic series is"+ sum);
		
		//Second Way to Harmonic Series
		
		/*int num=6,i=1;
		double rst=0.0;
		
		while(i <= num){
			
			System.out.print("1/"+i+"+");
			rst = rst+(double)1/i;
			i++;
		}
		System.out.println("\n\nSum of Harmonic series is"+ rst);*/
	}
}
