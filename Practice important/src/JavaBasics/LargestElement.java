package JavaBasics;

public class LargestElement 
{
	public static void main(String[] args) 
	{
		int[] i = {400,99,34,200,800};
		int large = i[0];
		int temp=0;
		
		for (int j = 0; j < i.length; j++) 
		{
            if(i[j]>large)
            {
            	temp = large;
            	large = i[j];
            }
		}
		System.out.println(large);
	}
}
