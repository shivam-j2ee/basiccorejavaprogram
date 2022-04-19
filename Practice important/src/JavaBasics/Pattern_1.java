package JavaBasics;

public class Pattern_1 
{
/*	4
	33
	222
	1111*/
	
	public static void main(String[] args) 
	{   
		System.out.println("triangle");
		
		for(int i=4;i>=1;i--){
			for(int j=4;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
