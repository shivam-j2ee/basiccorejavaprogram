package JavaBasics;

public class Pattern_3 
{
	
/*  5 5 5 5 5 
	4 4 4 4 
	3 3 3 
	2 2 
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5   */
	
	public static void main(String[] args) 
	{
		for (int i = 5; i>=1; i--) {
    		for (int j = 1; j <=i; j++) {
    			System.out.print(i+" ");
				
			}
			System.out.print("\n");
		}
    	for (int k = 2; k <=5; k++) {
			for (int l = 1; l <=k; l++) {
				System.out.print(k+" ");
			}
			System.out.print("\n");
		}
	}
}
