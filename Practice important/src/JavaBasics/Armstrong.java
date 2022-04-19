package JavaBasics;

public class Armstrong 
{
	public static void main(String[] args) 
	{
     int n =153;
     int temp=n;
     int a , sum=0;
     
		while (n > 0) 
		{
         a=n%10;
        // System.out.println(a);
         sum = sum+a*a*a;
         
         n=n/10;
       //  System.out.println(n);
		}
		System.out.println(sum);
		 if(temp==sum){
			 System.out.println("yes");
			
		 }else{
			 System.out.println("no");
		 }
	}
}
