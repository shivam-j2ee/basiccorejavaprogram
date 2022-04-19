package String;

public class CharCount 
{
	public static void main(String[] args) 
	{
     String s = "rahul sirwani";
     int count=0;
     
		for (int i = 0; i < s.length(); i++) 
		{
			count = 0;
			if (!s.substring(0, i).contains(s.charAt(i)+"")) 
			{
				for (int j = i; j < s.length(); j++) 
				{
					if (s.charAt(i) == s.charAt(j)) 
					{
						count++;
					}
				}
				System.out.println("The Character "+s.charAt(i)+" Occurse "+count+ "times");
			}
		}
     
	}
}
