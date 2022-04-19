package String;

public class CharAndVowel 
{
	public static void main(String[] args) 
	{
     String s = "Jai Shree Mahakal";
     
     int vow=0 , conso=0;
     
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
		  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		  {
			  vow++;
		  }else
		  {
			  conso++;
		  }
		}
		System.out.println("Vowel---"+vow);
		System.out.println("Consonants---"+conso);
	}
}
