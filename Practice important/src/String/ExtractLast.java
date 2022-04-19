package String;

public class ExtractLast 
{
	public static void main(String[] args) 
	{
		String s = "Jai Shree Mahakal";
		
		String[] s1 = s.split(" ");
		
		String s2 = s1[s1.length-1];
		
		System.out.println(s2);
		
	//	System.out.println(s2.charAt(s2.length()-1));
		
	}
}
