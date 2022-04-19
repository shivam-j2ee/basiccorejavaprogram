package String;

public class ChangeTo 
{
	public static void main(String[] args) 
	{
     String str = "Rays" , s="";
     
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				s = s+Character.toLowerCase(c);
			}else
			{
				s = s+Character.toUpperCase(c);
			}
		}
		System.out.println(s);
	}
}
