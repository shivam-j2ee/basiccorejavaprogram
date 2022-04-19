package String;

public class SplitExam 
{
	public static void main(String[] args) 
	{
     String str = "aa bb cc";
     String[] s = str.split(" ");
     
		for (int i = 0; i < s.length; i++) 
		{
         System.out.println(s[i]);
		}
     
	}
}
