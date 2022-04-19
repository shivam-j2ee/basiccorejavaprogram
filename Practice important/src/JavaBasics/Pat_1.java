package JavaBasics;

public class Pat_1 
{
	public static void main(String[] args) 
	{
		
	/*  1
		  12
		  123
		  1234
		  12345
		  123456
		  1234567     
		*/
		/*for (int i = 1; i <= 7; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
             System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*1
		  12
		  123
		  1234
		  12345
		  123456
		  1234567
		  123456
		  12345
		  1234
		  123
		  12
		  1 
		 * */
		
		/*int mid = 13;
		for (int i = 1; i <= (mid+1)/ 2; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
              System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = (mid - 1) / 2; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
               System.out.print(j);
			}
			System.out.println();
		}*/
		
	/*    1
		  22
		  333
		  4444
		  55555
		  666666
		  7777777
		 */
		
		/*for (int j = 1; j <= 7; j++) 
		{
			for (int i = 1; i <= j; i++) 
			{
             System.out.print(j);
			}
			System.out.println();
		}*/
		
	/*	7 6 5 4 3 2 1
		7 6 5 4 3 2 
		7 6 5 4 3 
		7 6 5 4
		7 6 5
		7 6
		7       */
		
		/*for (int i = 1; i <= 7; i++) 
		{
			for (int j = 7; j >= i; j--) 
			{
              System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
/*	    7 6 5 4 3 2 1
		6 5 4 3 2 1
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1        */
		
		/*for (int j = 0; j < 7; j++) 
		{
			for (int i = 7 - j; i >= 1; i--) 
			{
              System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
/*		7
		7 6 
		7 6 5
		7 6 5 4
		7 6 5 4 3
		7 6 5 4 3 2 
		7 6 5 4 3 2 1    */
		
		/*for (int i = 7; i >= 1; i--) 
		{
			for (int k = 7; k >= i; k--) 
			{
              System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
/*		1
		1 2 1
		1 2 3 2 1
		1 2 3 4 3 2 1
		1 2 3 4 5 4 3 2 1
		1 2 3 4 5 6 5 4 3 2 1
		1 2 3 4 5 6 7 6 5 4 3 2 1   */
		
		for (int j = 1; j <= 7; j++) 
		{
			for (int i = 1; i <j; i++) 
			{
              System.out.print("*");
			}
			System.out.println();
		}
		
		
		
/*		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2 
		1 
		1 2
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7    */
	}
}
