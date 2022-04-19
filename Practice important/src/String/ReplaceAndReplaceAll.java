package String;

public class ReplaceAndReplaceAll 
{
	public static void main(String[] args) 
	{
     String s = "Jai Shree Mahakal";
     
     System.out.println(s.replace('S', '#'));
     System.out.println(s.replaceAll("e", "@"));
     System.out.println(s.replaceAll("[Jai]", "om"));
	}
}
